class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
       
        int n= mat.length;
        int[][] result = new int[n][n];
        for(int i=0;i<n;i++ ){
            for(int j=0;j<n;j++){
               result[i][j] = mat[j][n-1-i];
            }
        }
        for(int i=0;i<n;i++ ){
            for(int j=0;j<n;j++){
               mat[i][j] = result[i][j];
            }
        }
        
        
    }
}