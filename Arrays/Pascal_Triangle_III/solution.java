class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        // Compute the entire Pascal's Triangle
        for(int row = 1; row <= n; row++) {
            pascalTriangle.add(generateRow(row));
        }

        // return the pascalTriangle
        return pascalTriangle;
    }

    private List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();

        // Inserting the 1st element
        ansRow.add(1);

        // Calculate the rest of the elements
        for(int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }

        return ansRow; // Return the computed row
    }
}