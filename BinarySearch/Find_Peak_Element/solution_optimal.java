class Solution {
  public int findPeakElement(int[] arr) {
    int n = arr.length;
    
    // Edge cases
    if(n == 1) return 0;
    if(arr[0] > arr[1]) return 0;
    if(arr[n - 1] > arr[n - 2]) return n - 1;

    // Initialize low and high for binary search range
    int low = 1, high = n - 2;
    while(low <= high) {
        int mid = (low + high) / 2;

        // If arr[mid] is the peak
        if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
            return mid;
        } 
        // If we are in the left (increasing curve)
        else if(arr[mid] > arr[mid - 1]) {
            // search in right
            low = mid + 1;
        }
        // If we are in the right, Or arr[mid] is a common point
        else {
            high = mid - 1;
        }
    }
    // If no peak element found (dummy return)
    return -1;
  }
}
