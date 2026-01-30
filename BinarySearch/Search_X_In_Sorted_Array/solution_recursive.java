class Solution {
    public int search(int[] nums, int target) {
        //Size of array
        int n = nums.length;

        //Find the target in the whole array
        return func(nums, 0, n-1, target);
    }

    //Helper function to find the target in the given range
    private int func(int[] nums, int low, int high, int target) {
        //base case
        if(low > high) return -1;

        int ind; //to store the index of target
        int mid = low + (high - low)/2;

        //If target is found, return  the index
        if(nums[mid] == target) ind = mid;

        //else if nums[mid] > target, search in left space
        else if(nums[mid] > target) ind = func(nums, low, mid-1, target);

        //else search in right space
        else ind = func(nums, mid+1, high, target);

        return ind; //return the index
    }
}