class Solution {
    int minRow(int mat[][]) {
        // code here
        int row = mat.length;
        int col = mat[0].length;
        int minCount = Integer.MAX_VALUE;
        int minRow = 0;
        for(int i=0;i<row;i++){
            int count =0;
            for(int j=0;j<col;j++){
                if(mat[i][j]==1) count++;
                
            }
            if(count< minCount){
                minCount = count;
                minRow=i;
            }
        }
        
        return minRow+1;
        
    }
};