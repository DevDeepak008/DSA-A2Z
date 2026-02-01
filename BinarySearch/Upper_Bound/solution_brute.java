class Solution {
    public int upperBound(int[] nums, int x) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] > x) {
                return i;
            }
        }
        return n;
    }
}
