class Solution {
    public int divide(int dividend, int divisor) {
        // Base case: both numbers equal
        if (dividend == divisor) return 1;

        // Handle overflow (Integer.MIN_VALUE / -1)
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        // Dividing by 1 returns the number itself
        if (divisor == 1) return dividend;

        // Determine the sign of the result
        boolean isPositive = !((dividend >= 0 && divisor < 0) || (dividend < 0 && divisor > 0));

        // Convert to long for safety and take absolute values
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        // Variable to store result
        long ans = 0;

        // Brute-force loop: repeatedly subtract divisor
        while (n >= d) {

            // Subtract divisor from dividend
            n -= d;

            // Increment quotient
            ans++;
        }

        // Check for overflow
        if (ans > Integer.MAX_VALUE)
            return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        // Apply sign and return
        return isPositive ? (int) ans : (int) -ans;
    }
}