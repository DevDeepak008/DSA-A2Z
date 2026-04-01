class Solution {

    /* Function to find the XOR 
    of numbers from L to R */
    public int findRangeXOR(int l, int r) {
        
        // To store the XOR of numbers
        int ans = 0;
        
        // XOR all the numbers
        for (int i = l; i <= r; i++) {
            ans ^= i;
        }
        
        // Return the result
        return ans;
    }
}