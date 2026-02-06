class Solution {
    public int findMin(ArrayList<Integer> arr) {
      int mini = Integer.MAX_VALUE;
      for(int i = 0; i < arr.size(); i++) {
        mini = Math.min(mini, arr.get(i));
      }
      return mini;
    }
}
