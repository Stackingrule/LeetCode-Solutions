public class Solution {
    public int minPatches(int[] nums, int n) {
        if (nums == null || n <= 0) return -1;

        long miss = 1;
        int index = 0;
        int result = 0;
        while (miss <= n) {
            if (index < nums.length && nums[index] <= miss) {
                miss += nums[index];
                index++;
            } else {
                result += 1;
                miss = miss << 1;
            }
        }

        return result;
    }
}