class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum=0;
        sum=arrivalTime+delayedTime;
        if(sum<24){
            return sum;
        }
        else{
            return sum-24;
        }
    }
}
//leetcode