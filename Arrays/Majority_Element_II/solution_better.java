class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
        int n = nums.length;

        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> mpp = new HashMap<>();

        // least occurrence of the majority element
        int mini = n / 3 + 1;

        // storing the elements with its occurrence
        for (int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            // checking if nums[i] is the majority element
            if (mpp.get(nums[i]) == mini) {
                result.add(nums[i]);
            }

            // if result size is 2, break out of loop
            if (result.size() == 2) {
                break;
            }
        }

        return result;
    }
}