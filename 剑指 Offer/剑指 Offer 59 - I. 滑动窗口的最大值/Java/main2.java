class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k < 1 || nums.length < k) {
            return new int[0];
        }

        int[] res = new int[nums.length - k + 1];
        int index = 0;  // 窗口的左端
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < nums.length; ++i) {
            while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {
                q.pollLast();
            }
            q.addLast(i);
            if (q.peekFirst() == (i - k)) {
                q.pollFirst();
            }
            if (i >= (k - 1)) {
                res[index++] = nums[q.peekFirst()];
            }
        }
        return res;
    }
}

