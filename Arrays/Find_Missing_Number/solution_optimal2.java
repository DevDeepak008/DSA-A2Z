class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0, xor2 = 0;

        for(int i = 0; i < nums.length; i++) {
            xor1 = xor1 ^ (i+1); // XOR up to [1...N]
            xor2 = xor2 ^ nums[i]; //Xor of array elements
        }

        return (xor1 ^ xor2);
    }
}