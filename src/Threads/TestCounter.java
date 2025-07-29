package Threads;

class Counter {
    private int count = 0;

    // Synchronized increment ensures thread safety
    public synchronized void increment() {
        count++;
    }

    public synchronized int get() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;
    private int times;

    public CounterThread(Counter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    public void run() {
        for (int i = 0; i < times; i++) {
            counter.increment();
        }
    }
}


public class TestCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        CounterThread t1 = new CounterThread(c, 1000);
        CounterThread t2 = new CounterThread(c, 1000);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + c.get());
    }
}
