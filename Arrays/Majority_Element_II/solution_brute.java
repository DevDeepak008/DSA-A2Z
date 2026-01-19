class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
        int n = nums.length;

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(result.size() == 0 || result.get(0) != nums[i]) {
                int cnt = 0;
                for(int j = 0; j < n; j++) {
                    if(nums[j] == nums[i]) {
                        cnt++;
                    }
                }

                // check if frequency is greater than n/3
                if(cnt > (n/3)) {
                    result.add(nums[i]);
                }
            }

            if(result.size() == 2) {
                break;
            }
        }

        return result;
    }
}