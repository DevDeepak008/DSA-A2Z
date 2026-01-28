class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        //Number of subarrays 
        int count = 0;

        //starting index i
        for(int i = 0; i < n; i++) {
            int sum = 0;
            //ending index j
            for(int j = i; j < n; j++) {
                //calculate the sum of subarray [i...j]
                sum += nums[j];
                //Increase the count if sum == k
                if(sum == k) count++;
            }
        }
        return count;
    }
}