class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        // Initialize the matrix
        int[][] matrix = new int[m][n];
        // Fill matrix with -1 as default value (or any other sentinel value)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

        int minr = 0; // Minimum row
        int maxr = m - 1; // Maximum row
        int minc = 0; // Minimum column
        int maxc = n - 1; // Maximum column

        ListNode current = head; // Pointer to traverse the linked list

        // Spiral traversal
        while (minr <= maxr && minc <= maxc && current != null) {
            // Fill the top row (left to right)
            for (int j = minc; j <= maxc && current != null; j++) {
                matrix[minr][j] = current.val;
                current = current.next;
            }
            minr++;

            // Fill the right column (top to bottom)
            for (int i = minr; i <= maxr && current != null; i++) {
                matrix[i][maxc] = current.val;
                current = current.next;
            }
            maxc--;

            // Fill the bottom row (right to left)
            for (int j = maxc; j >= minc && current != null; j--) {
                matrix[maxr][j] = current.val;
                current = current.next;
            }
            maxr--;

            // Fill the left column (bottom to top)
            for (int i = maxr; i >= minr && current != null; i--) {
                matrix[i][minc] = current.val;
                current = current.next;
            }
            minc++;
        }

        return matrix; // Return the spiral-filled matrix
    }
}


