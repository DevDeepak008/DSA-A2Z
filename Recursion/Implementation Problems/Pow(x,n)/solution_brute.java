class Solution {
    public double myPow(double x, int n) {
          //your code goes here
          if(n == 0 || x == 1.0) return 1;

          long temp = n; // to avoid integer overflow

          // Handle negative exponents
          if(n < 0) {
            x = 1 / x;
            temp = -1L * n;
          }

          double ans = 1;
          for(long i = 0; i < temp; i++) {
            // Multiply ans by x for n times
            ans *= x;
          }
          return ans;
    }
}