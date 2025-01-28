class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                if(nums[j]>nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        return nums[n/2];
    }
}