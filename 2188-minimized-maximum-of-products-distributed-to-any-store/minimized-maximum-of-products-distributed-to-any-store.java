class Solution {
    public boolean isPossible(int maxq,int n,int[] arr){
        int stores=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%maxq==0) stores+=arr[i]/maxq;
            else stores+=arr[i]/maxq +1;
        }
        if(stores>n) return false;
        else return true;
    }
    public int minimizedMaximum(int n, int[] arr) {
        int m=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            mx=Math.max(mx,arr[i]);
        }
        int low=1;
        int high=mx;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,n,arr)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}