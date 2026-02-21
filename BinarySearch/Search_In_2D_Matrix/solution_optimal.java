class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        
        // Check if the matrix is empty
        if(mat.length == 0 || mat[0].length == 0) {
            return false;
        }
        int n = mat.length;
        int m = mat[0].length;
        
        // Apply binary search hypothetically
        int low = 0, high = n * m - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            // Calculate row and col
            int row = mid / m;
            int col = mid % m;

            if(mat[row][col] == target) return true;
            else if(mat[row][col] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
