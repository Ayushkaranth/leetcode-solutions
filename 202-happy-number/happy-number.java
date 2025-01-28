public class Solution {
    public boolean isHappy(int n) {
        return isHappyRecursive(n, n);
    }

    private boolean isHappyRecursive(int slow, int fast) {
        slow = digitSquareSum(slow);
        fast = digitSquareSum(digitSquareSum(fast));

        if (slow == 1 || fast == 1) return true;
        if (slow == fast) return false;

        return isHappyRecursive(slow, fast);
    }

    private int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}

