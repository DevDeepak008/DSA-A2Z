import java.util.*;

class Solution {
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return -1;
        }

        Arrays.sort(nums);
        int largest = nums[n - 1];
        int secondLargest = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                secondLargest = nums[i];
                break;
            }
        }
        return secondLargest;
    }
}