class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int k = 0; // index for the merged array
        int[] c = new int[m + n];
        int i = 0; // index for array a
        int j = 0; // index for array b

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

        // If you want to modify array a in place
        for (i = 0; i < m + n; i++) {
            a[i] = c[i];
        }
    }
}
