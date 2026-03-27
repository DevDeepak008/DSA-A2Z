class Solution {
    /* Function to get the single 
    number in the given array */
    public int singleNumber(int[] nums) {
        /* Variable to store XOR
        of all numbers in array */
        int XOR = 0;
        
        /* Iterate on the array to
        find XOR of all elements */
        for (int i = 0; i < nums.length; i++) {
            XOR ^= nums[i];    
        }
        
        // XOR stores the required answer
        return XOR;        
    }
}