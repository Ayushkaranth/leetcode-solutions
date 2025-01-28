class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] a = new char[128]; // Correct array initialization
        
        // First pass: Map characters from s to t
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int) ch;
            if (a[idx] == '\0') {
                a[idx] = dh;
            } else {
                if (a[idx] != dh) {
                    return false;
                }
            }
        }
        
        // Clear the array
        for (int i = 0; i < 128; i++) {
            a[i] = '\0';
        }
        
        // Second pass: Map characters from t to s
        for (int i = 0; i < s.length(); i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int idx = (int) ch;
            if (a[idx] == '\0') {
                a[idx] = dh;
            } else {
                if (a[idx] != dh) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
