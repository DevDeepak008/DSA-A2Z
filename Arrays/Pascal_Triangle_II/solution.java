class Solution {
    public int[] pascalTriangleII(int r) {
        int[] ans = new int[r]; // to store the answer

        // Set the first element of the row as 1
        ans[0] = 1;

        // Compute each element in the rth row
        for(int i = 1; i < r; i++) {
            ans[i] = (ans[i-1] * (r-i)) / i;
        }

        return ans;
    }
}