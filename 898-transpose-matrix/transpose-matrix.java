class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;       // number of rows
        int n = matrix[0].length;    // number of columns
        int[][] transpose = new int[n][m]; // transposed matrix

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
}
