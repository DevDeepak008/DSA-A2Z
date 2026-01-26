class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        //Return 0 if array is empty
        if(n == 0) return 0;
        //Sort the array
        Arrays.sort(nums);

        //Track last smaller element
        int lastSmaller = Integer.MIN_VALUE;
        //Count current sequence length
        int cnt = 0;
        //Track longest sequence length
        int longest = 1;

        for(int i = 0; i < n; i++) {
            //If consecutive number exists
            if(nums[i] - 1 == lastSmaller) {
                //Increment sequence Count
                cnt += 1;
                //Update last smaller element
                lastSmaller = nums[i];
            }
            //If consecutive number doesn't exists
            else if(nums[i] != lastSmaller) {
                //Reset count for new sequence
                cnt = 1;
                //Update last smaller element
                lastSmaller = nums[i];
            }
            //Update longest if needed
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}