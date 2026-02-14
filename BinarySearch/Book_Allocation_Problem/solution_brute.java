class Solution {
    // Function to count the number of students required given the maximum pages each student can read
    private int countStudents(int[] nums, int pages) {
        int n = nums.length;
        int students = 1;
        int pagesStudent = 0;

        for(int i = 0; i < n; i++) {
            if(pagesStudent + nums[i] <= pages) {
                // Add pages to current student
                pagesStudent += nums[i];
            } else {
                // Add pages to next student
                students++;
                pagesStudent = nums[i];
            }
        }
        return students;
    }


    public int findPages(int[] nums, int m) {
        int n = nums.length;

        // Book allocation impossible
        if(m > n) return -1;

        // Calculate the range for search
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i < n; i++) {
            low = Math.max(low, nums[i]);
            high = high + nums[i];
        }

        // Linear search for minimum maximum pages
        for(int pages = low; pages <= high; pages++) {
            if(countStudents(nums, pages) <= m) {
                return pages;
            }
        }
        return low;
    }
}