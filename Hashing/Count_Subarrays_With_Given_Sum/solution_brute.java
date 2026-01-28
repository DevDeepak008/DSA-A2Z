class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        //Number of subarrays 
        int cnt = 0;

        //starting index i
        for(int i = 0; i < n; i++) {
            //ending index j
            for(int j = i; j < n; j++) {
                //calculate the sum of subarray [i...j]
                int sum = 0;
                for(int K = i; K <= j; K++) {
                    sum += nums[K];
                }
                //Increase the count if sum == k
                if(sum == k) cnt++;
            }
        }
        return cnt;
    }
}