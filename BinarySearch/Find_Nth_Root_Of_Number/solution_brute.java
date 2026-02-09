class Solution {
    public int NthRoot(int N, int M) {
        // Linear search on the answer space
        for(int i = 1; i <= M; i++) {
            long val = Pow(i, N);

            // Check if the computed value is equal to M
            if(val == M) return i;
            else if(val > M) break;
        }
        return -1;
    }

    private long Pow(int b, int exp) {
        long ans = 1;
        long base = b;

        // Exponentiationn by squaring method
        while(exp > 0) {
            if(exp % 2 == 1) {
                exp--;
                ans *= base;
            } else {
                exp /= 2;
                base *= base;
            }
        }
        return ans;
    }
}
