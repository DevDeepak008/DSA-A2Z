import java.util.*;

class Solution {
    public int largestElement(int[] nums) {
        Arrays.sort(nums);
        int largest = nums[nums.length - 1];
        return largest;
    }
}