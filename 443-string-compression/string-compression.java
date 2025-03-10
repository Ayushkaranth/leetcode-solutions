class Solution {
    public int compress(char[] arr) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (arr[j] == arr[i]) {
                j++;
            } else {
                ans.append(arr[i]);
                int len = j - i;
                if (len > 1) {
                    ans.append(len);
                }
                i = j;
            }
        }
        
        // Append the last sequence
        ans.append(arr[i]);
        int len = j - i;
        if (len > 1) {
            ans.append(len);
        }
        
        // Copy the compressed characters back into the original array
        for (i = 0; i < ans.length(); i++) {
            arr[i] = ans.charAt(i);
        }
        
        return ans.length();
    }
}
