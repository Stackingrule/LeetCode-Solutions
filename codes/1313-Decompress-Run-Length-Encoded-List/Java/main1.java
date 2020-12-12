class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int t = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i]; j++) {
                a.add(nums[i + 1]);
            }
        }
        int b[] = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            b[i] = a.get(i);
        }
        return b;
    }
}