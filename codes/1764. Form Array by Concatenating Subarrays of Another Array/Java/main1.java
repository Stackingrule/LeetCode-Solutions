class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int i = 0;
        int current_group = 0;
        while (current_group < groups.length) { // Check every group
            while (i < nums.length) { // Loop through nums
				if (i + groups[current_group].length > nums.length) { // If we would end up going bounds of nums
                    return false; // Return false because we can no longer possibly match the group
                }
			
                if (isEqual(nums, groups[current_group], i)) {
                    i += groups[current_group].length; // Move i forward to keep disjoint subarrays
                    current_group++;
                    break; // Move on to the next group by breaking out of the inner while loop
                }
                i++;
            }
            // If we reached the end nums and we haven't checked off every group
            if (i == nums.length && current_group != groups.length) {
                return false;
            }
        }
        return true;
    }
    
    // This function checks if a subarray of nums is equal to a group
    private boolean isEqual(int[] nums, int[] group, int index) {
        int[] subarray = Arrays.copyOfRange(nums, index, index + group.length);
        return Arrays.equals(subarray, group);
    }
}