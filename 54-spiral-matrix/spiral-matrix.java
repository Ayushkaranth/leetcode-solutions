class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        List<Integer> ans=new ArrayList<>();
        int minr=0;
        int maxr=m-1;
        int minc=0;
        int maxc=n-1;
        while(minr<=maxr || minc<=maxc){
            for(int j=minc;j<=maxc;j++){
                ans.add(arr[minr][j]);
            } minr++;
            if(minr>maxr || minc>maxc) break;
            for(int i=minr;i<=maxr;i++){
                ans.add(arr[i][maxc]);
            } maxc--;
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc;j>=minc;j--){
                ans.add(arr[maxr][j]);
            } maxr--;
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr;i>=minr;i--){
                ans.add(arr[i][minc]);
            } minc++;
        }
        return ans;
    }
}