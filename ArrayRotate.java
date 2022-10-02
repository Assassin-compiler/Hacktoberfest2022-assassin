class Solution {
    public void rotate(int[][] arr) {
        int n = arr[0].length;
        
        //finding transpose
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                arr[i][j] = arr[i][j]+arr[j][i];
                arr[j][i] = arr[i][j]-arr[j][i];
                arr[i][j] = arr[i][j]-arr[j][i];
            }
        }
        
        //reversing the rows
        for(int i=0;i<n;i++) {
            for(int j=0;j<n/2;j++) {
                arr[i][j] = arr[i][j]+arr[i][n-j-1];
                arr[i][n-j-1] = arr[i][j]-arr[i][n-j-1];
                arr[i][j] = arr[i][j]-arr[i][n-j-1];
            }
        }
    }
}
