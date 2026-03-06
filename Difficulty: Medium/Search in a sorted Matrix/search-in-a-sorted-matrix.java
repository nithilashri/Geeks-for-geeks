class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int row = mat.length;
        int col = mat[0].length;
        int r =0;
        int c=col-1;
        boolean result= false;
        while(r<row && c>=0){
            if(mat[r][c]==x){
                result=true;
                break;
            }else if(mat[r][c]<x){
                r++;
            }else if(mat[r][c]>x){
                c--;
            }
        }
        
        return result;
        
        
        
    }
}
