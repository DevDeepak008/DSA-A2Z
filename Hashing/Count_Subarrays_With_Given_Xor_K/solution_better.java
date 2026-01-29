class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;

        //Step-1 : Generate subarrays
        for(int i = 0; i < n; i++) {
            int xorr = 0;
            for(int j = i; j < n; j++) {
                //Step-2 : Calculate XOR of all elements in the subarray
                xorr = xorr ^ nums[j];
                //Step-3 : Check XOR and count
                if(xorr == k) cnt++;
            }
        }
        return cnt;
    }
}