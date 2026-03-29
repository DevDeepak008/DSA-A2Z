class Solution{
public int[] singleNumber(int[] nums) {
    // Array to store the answer
    int[] ans = new int[2];
    
    /* Map to store the elements 
    and their frequencies */
    HashMap<Integer, Integer> mpp = new HashMap<>();
    
    // Iterate on the array
    for (int num : nums) {
        mpp.put(num, mpp.getOrDefault(num, 0) + 1); // Update the map
    }
    
    // Iterate on the map
    int index = 0;
    for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
        // If frequency is 1
        if (entry.getValue() == 1) {
            /* Add the element to
            the result array */
            ans[index++] = entry.getKey();
        }
    }
    
    return ans;
}
}