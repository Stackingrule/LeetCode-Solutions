class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length, i = 0, j = n - 1;
        int[] t = new int[n];
        t = nums.clone();
        Arrays.sort(t);
        while (i < n && nums[i] == t[i]) ++i;
        while (j > i && nums[j] == t[j]) --j;
        return j - i + 1;
    }
}