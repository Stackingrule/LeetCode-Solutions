class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        int total = (1 << nums.length);
        for (int i = 0; i < total; ++i) {
            LinkedList<Integer> list = new LinkedList<>();
            int num = i, idx = 0;
            while (num != 0) {
                if ((num & 1) != 0)
                    list.addLast(nums[idx]);
                num >>= 1;
                ++idx;
            }
            res.add(list);
        }
        return res;
    }
}