/**
* 两个 dp 数组，其中 f[i] 表示子数组 [0, i] 范围内并且一定包含 nums[i] 数字的最大子数组乘积，
* g[i] 表示子数组 [0, i] 范围内并且一定包含 nums[i] 数字的最小子数组乘积，
* 初始化时 f[0] 和 g[0] 都初始化为 nums[0]，其余都初始化为0
*/
class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int res = nums[0], n = nums.size();
        vector<int> f(n, 0), g(n, 0);
        f[0] = nums[0];
        g[0] = nums[0];
        for (int i = 1; i < n; ++i) {
        	f[i] = max(max(f[i - 1] * nums[i], g[i - 1] * nums[i]), nums[i]);
        	g[i] = min(min(f[i - 1] * nums[i], g[i - 1] * nums[i]), nums[i]);
        	res = max(res, f[i]);
        }
        return res;
    }
};