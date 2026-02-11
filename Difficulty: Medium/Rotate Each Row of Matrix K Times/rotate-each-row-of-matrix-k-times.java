// User function template for java

class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {

        int rows = mat.length;
        int cols = mat[0].length;

        k = k % cols;

        for (int i = 0; i < rows; i++) {

            int[] temp = new int[k];

            
            for (int j = 0; j < k; j++) {
                temp[j] = mat[i][j];
            }


            for (int j = k; j < cols; j++) {
                mat[i][j - k] = mat[i][j];
            }

           
            for (int j = 0; j < k; j++) {
                mat[i][cols - k + j] = temp[j];
            }
        }

        return mat;
    }
}
