class Solution {
    public int[] matrixDiagonally(int[][] mat) {

        int n = mat.length;
        int i = 0, j = 0;
        int index = 0;
        boolean up = true;

        int[] result = new int[n * n];

        while (index < n * n) {

            if (up) {

                while (i >= 0 && j < n) {
                    result[index++] = mat[i][j];

                    if (j == n - 1) {
                        i++;
                        break;
                    } else if (i == 0) {
                        j++;
                        break;
                    }

                    i--;
                    j++;
                }

            } else {

                while (i < n && j >= 0) {
                    result[index++] = mat[i][j];

                    if (i == n - 1) {
                        j++;
                        break;
                    } else if (j == 0) {
                        i++;
                        break;
                    }

                    i++;
                    j--;
                }
            }

            up = !up;  
        }

        return result;
    }
}
