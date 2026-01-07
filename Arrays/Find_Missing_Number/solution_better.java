class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int[] freq = new int[N + 1];

        for(int num : nums) {
            freq[num]++;
        }

        for(int i = 0; i <= N; i++) {
            if(freq[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}