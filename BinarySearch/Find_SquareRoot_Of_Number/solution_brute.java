class Solution {
    public int floorSqrt(int n) {
      int ans = 0;

      // Linear search in the answer space
      for(int i = 1; i <= n; i++) {
        long val = (long) i * (long) i;
        // Check if val is less than or equal to n
        if(val <= (long)n) {
            // Update ans to current value of i
            ans = i;
        } else {
            // exit loop if val exceeds n
            break;
        }
      }

      // Return the computed floor of square root
      return ans;
    }
}