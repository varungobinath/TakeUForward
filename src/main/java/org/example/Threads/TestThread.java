package Threads;

class RunnableDemo implements Runnable {
    private String threadName;
    private int times;

    RunnableDemo(String name,int times) {
        threadName = name;
        this.times = times;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = times; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}

public class TestThread {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo("Thread-1",100);
        RunnableDemo R2 = new RunnableDemo("Thread-2",50);

        // Create Thread instances and pass the runnable object
        Thread t1 = new Thread(R1, "Thread-1");
        Thread t2 = new Thread(R2, "Thread-2");

        // Start the threads
        t1.start();
        t2.start();
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("exiting...............");
    }
}
