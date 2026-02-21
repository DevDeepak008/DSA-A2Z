class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        
        // Check if the matrix is empty
        if(mat.length == 0 || mat[0].length == 0) {
            return false;
        }
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0; i < n; i++) {
            if(mat[i][0] <= target && target <= mat[i][m - 1]) {
                return binarySearch(mat[i], target);
            }
        }
        return false;
    }

    private boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target) return true;
            else if(arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
