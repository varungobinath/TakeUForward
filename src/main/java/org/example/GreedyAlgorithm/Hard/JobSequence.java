package GreedyAlgorithm.Hard;

import java.util.Arrays;

public class JobSequence {
    static class Job{
        int id;
        int deadline;
        int profit;
        Job(int id,int deadline,int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        Job[] jobs = new Job[4];
        jobs[0] = new Job(1,4,40);
        jobs[1] = new Job(2,1,10);
        jobs[2] = new Job(3,1,40);
        jobs[3] = new Job(4,1,20);
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);
        int maxDeadline = -1;
        for(Job job : jobs){
            maxDeadline = Math.max(maxDeadline,job.deadline);
        }
        Integer[] days = new Integer[maxDeadline+1];
        int count = 0;
        int countProfit = 0;
        for(Job job : jobs){
            int deadline = job.deadline;
            while(deadline>0 && days[deadline]!=null) deadline--;
            if(deadline>0) {
                days[deadline] = job.id;
                count++;
                countProfit+=job.profit;
            }
        }
        System.out.println(count+" "+countProfit);
        System.out.println(Arrays.toString(days));
    }
}
