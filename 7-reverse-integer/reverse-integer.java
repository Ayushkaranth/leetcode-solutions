class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10; // Extract the last digit
            x /= 10; // Remove the last digit from x

            // Check for overflow before updating reversed
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow for positive numbers
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow for negative numbers
            }

            reversed = reversed * 10 + digit; // Append the digit to the reversed number
        }
        return reversed;
    }
}
