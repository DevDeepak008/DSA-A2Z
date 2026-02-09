class Solution {
    public int floorSqrt(int n) {
      int low = 1, high = n;

      // Binary search on the answer space
      while(low <= high) {
        int mid = low + (high - low) / 2;
        long val = (long) mid * (long) mid; // mid*mid in 64-bit

        // Check if val is less than or equal to n
        if(val <= (long) n) {
            // Move to the right part
            low = mid + 1;
        } else {
            // Move to the right part
            high = mid - 1;
        }
      }

      // Return the computed floor of square root
      return high;
    }
}