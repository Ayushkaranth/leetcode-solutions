class Solution {
    public int matrixScore(int[][] arr) {
        int i;
        int j;
        int m = arr.length;
        int n = arr[0].length;

        // Step 1: Ensure the first column is all 1s by flipping rows where the first column is 0
        for (i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                for (j = 0; j < n; j++) {
                    if (arr[i][j] == 0) arr[i][j] = 1;
                    else arr[i][j] = 0;
                }
            }
        }

        // Step 2: Flip columns if there are more 0s than 1s
        for (j = 1; j < n; j++) { // Correct iteration over columns
            int noz = 0;
            int noo = 0;
            for (i = 0; i < m; i++) { // Correct iteration over rows
                if (arr[i][j] == 0) noz++;
                else noo++;
            }
            if (noz > noo) {
                for (i = 0; i < m; i++) { // Correct iteration over rows
                    if (arr[i][j] == 0) arr[i][j] = 1;
                    else arr[i][j] = 0;
                }
            }
        }

        // Step 3: Calculate the total score by converting each row to a binary number
        int x = 1;
        int score = 0;
        for (j = n - 1; j >= 0; j--) { // Iterate columns in reverse to build the number
            for (i = 0; i < m; i++) {
                score += (arr[i][j] * x);
            }
            x *= 2;
        }
        return score;
    }
}
