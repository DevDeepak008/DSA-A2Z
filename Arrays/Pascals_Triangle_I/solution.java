class Solution {
    public int pascalTriangleI(int r, int c) {
        return nCr(r-1, c-1);
    }

    // Function to calculate nCr
    private static int nCr(int n, int r) {
        // Choose the smaller value for lesser iterations
        if(r > n-r) r = n-r;

        // base case
        if(r == 1) return n;

        int res = 1; // to store the result

        // Calculate nCr using iterative method avoiding overflow
        for(int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }
}