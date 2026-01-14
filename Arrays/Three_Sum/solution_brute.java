class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> tripletSet = new HashSet<>();

        int n = nums.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if(i != j && j != k && i != k && nums[i] + nums[j] + nums[k] == 0) {
                        // Found a triplet that sums up to target
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        // Sort the triplet to ensure uniqueness when storing in Set
                        Collections.sort(temp);
                        tripletSet.add(temp);
                    }
                }
            }
        }

        // Convert set to list of list
        List<List<Integer>> ans = new ArrayList<>(tripletSet);
        return ans;
    }
}