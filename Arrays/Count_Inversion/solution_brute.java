class Solution {
    // Function to find number of inversions in an array
    public long numberOfInversions(int[] nums) {

        // Size of the array
        int n = nums.length;

        // Count the number of pairs
        long cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                /*
                 * If nums[i] is greater than
                 * nums[j], increase count by 1
                 */
                if (nums[i] > nums[j]) {
                    cnt++;
                }
            }
        }

        // Return the count of inversions
        return cnt;
    }
}