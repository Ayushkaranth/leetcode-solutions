class Solution {
    public void setZeroes(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        boolean zerorow=false;
        boolean zerocol=false;

        for(int j=0;j<n;j++){
            if(arr[0][j]==0){
                zerorow=true;
                break;
            }
        }
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                zerocol=true;
                break;
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        for(int j=1;j<n;j++){
            if(arr[0][j]==0){
                for(int i=0;i<m;i++){
                    arr[i][j]=0;
                }
            }
        }
        for(int i=1;i<m;i++){
            if(arr[i][0]==0){
                for(int j=0;j<n;j++){
                    arr[i][j]=0;
                }
            }
        }

        if(zerorow==true){
            for(int j=0;j<n;j++){
                arr[0][j]=0;
            }
        }
        if(zerocol==true){
            for(int i=0;i<m;i++){
                arr[i][0]=0;
            }
        }
    }
}