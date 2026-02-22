class Solution {
    public int findMedian(int[][] matrix) {
        // Step-1 : Flatten the matrix into a list
        List<Integer> flattened = new ArrayList<>();
        for(int[] row : matrix) {
            for(int val : row) {
                flattened.add(val);
            }
        }

        // Step-2 : Sort the list
        Collections.sort(flattened);

        // Step-3 : Return the middle element
        int n = flattened.size();
        return flattened.get(n / 2);
      
    }
}