class Solution {
    public int[] findMaxRow(int mat[][], int N) {

        int row = 0;
        int col = N - 1;
        int maxRow = 0;

        while(row < N && col >= 0){
            
            if(mat[row][col] == 1){
                maxRow = row;
                col--;
            }
            else{
                row++;
            }
        }

        int count =  N - col - 1;

        return new int[]{maxRow, count};
    }
}