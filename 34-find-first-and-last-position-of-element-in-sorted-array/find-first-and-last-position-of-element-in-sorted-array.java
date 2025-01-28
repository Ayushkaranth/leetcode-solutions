class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n=arr.length;
        int[] ans=new int[2];
        int low,high;
        //first position
        int fp=-1;
        low=0;
        high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                if( mid>0 && arr[mid]==arr[mid-1]) high=mid-1;
                else{
                    fp=mid;
                    break;
                }
            }
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        //last position
        int lp=-1;
        low=0;
        high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                if( mid<n-1 && arr[mid]==arr[mid+1]) low=mid+1;
                else{
                    lp=mid;
                    break;
                }
            }
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        ans[0]=fp;
        ans[1]=lp;
        return ans;
    }
}