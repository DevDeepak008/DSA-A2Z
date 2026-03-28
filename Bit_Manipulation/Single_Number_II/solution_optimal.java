class Solution {
    public int singleNumber(int[] nums) {
        // Two buckets
        int ones = 0, twos = 0;

        // Traverse the array 
        for (int i = 0; i < nums.length; i++) {
            // Add the number to Ones, if it is not in Twos
            ones = (ones ^ nums[i]) & ~twos;

            // Add the number to Twos, if it is already in Ones
            twos = (twos ^ nums[i]) & ~ones;
        }

        return ones;
    }
}