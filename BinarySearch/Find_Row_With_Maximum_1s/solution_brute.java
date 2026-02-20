class Solution {
    /* Function to find the row 
    with the maximum number of 1's*/
    public int rowWithMax1s(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        /* Variable to store the 
        maximum count of 1's found*/
        int cnt_max = -1; 
        
        /* Variable to store the index
        of the row with max 1's*/
        int index = -1;  

        // Traverse the matrix row by row
        for (int i = 0; i < n; i++) {
            
            /* Counter for 1's 
            in the current row*/
            int cnt_ones = 0; 

            /* Count the number of 
            1's in the current row*/
            for (int j = 0; j < m; j++) {
                cnt_ones += mat[i][j];
            }

            /* Update cnt_max and index if current
            row has more 1's than previously found*/
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }

        /* Return the index of the row 
        with the maximum number of 1's*/
        return index;
    }
}