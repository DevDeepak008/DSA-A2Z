class Solution {
    public int findMin(ArrayList<Integer> arr) {
      int low = 0, high = arr.size() - 1;
      int ans = Integer.MAX_VALUE;
      while(low <= high) {
        int mid = (low + high) / 2;

        // Check if left part is sorted
        if(arr.get(low) <= arr.get(mid)) {
            // Update ans with minimum of ans and arr[low]
            ans = Math.min(ans, arr.get(low));
            // Move to the right part
            low = mid + 1;
        } else {
            // Update ans with minimum of ans and arr[mid]
            ans = Math.min(ans, arr.get(mid));
            // Move to the left part
            high = mid - 1;
        }
      }
      // Return the minimum elelemnt found
      return ans;
    }
}
