class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1; // The number to be filled in the matrix
        int minr = 0; // Minimum row index
        int maxr = n - 1; // Maximum row index
        int minc = 0; // Minimum column index
        int maxc = n - 1; // Maximum column index
        
        while (minr <= maxr && minc <= maxc) {
            // Fill the top row from left to right
            for (int j = minc; j <= maxc; j++) {
                matrix[minr][j] = num++;
            }
            minr++;

            // Fill the right column from top to bottom
            for (int i = minr; i <= maxr; i++) {
                matrix[i][maxc] = num++;
            }
            maxc--;

            // Fill the bottom row from right to left
            if (minr <= maxr) {
                for (int j = maxc; j >= minc; j--) {
                    matrix[maxr][j] = num++;
                }
                maxr--;
            }

            // Fill the left column from bottom to top
            if (minc <= maxc) {
                for (int i = maxr; i >= minr; i--) {
                    matrix[i][minc] = num++;
                }
                minc++;
            }
        }
        
        return matrix;
    }
}
