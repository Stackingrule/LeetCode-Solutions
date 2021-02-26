public class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        if (n == 0) {

            return 0;
        }

        // 求一下总和模p是多少
        int sum = 0;
        for (int num : nums) {

            sum = (sum + num) % p;
        }

        // 如果总和模p为0，则不用删除任何子数组，返回0
        if (sum == 0) {

            return 0;
        }

        int res = n;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        // 为了节省空间，就不开前缀和数组了，由preSum变量代替
        for (int i = 0, preSum = 0; i < n; i++) {

            preSum = (preSum + nums[i]) % p;

            int key = (preSum - sum + p) % p;
            if (map.containsKey(key)) {

                int l = map.get(key);
                res = Math.min(res, i + 1 - l);
            }

            map.put(preSum, i + 1);
        }

        return res == n ? -1 : res;
    }
}