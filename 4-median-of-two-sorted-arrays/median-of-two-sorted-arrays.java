class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int k = 0;
        int[] c = new int[m + n];
        int i = 0;
        int j = 0;

        // Merge the arrays
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from a (if any)
        while (i < m) {
            c[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements from b (if any)
        while (j < n) {
            c[k] = b[j];
            j++;
            k++;
        }

        // Find the median
        int totalLength = m + n;
        if (totalLength % 2 == 1) {
            // If the total length is odd, return the middle element
            return c[totalLength / 2];
        } else {
            // If the total length is even, return the average of the two middle elements
            return (c[totalLength / 2 - 1] + c[totalLength / 2]) / 2.0;
        }
    }
}
