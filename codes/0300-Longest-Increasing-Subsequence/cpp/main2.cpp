/*
思路是先建立一个空的 dp 数组，然后开始遍历原数组，
对于每一个遍历到的数字，用二分查找法在 dp 数组找第一个不小于它的数字，
如果这个数字不存在，那么直接在 dp 数组后面加上遍历到的数字，
如果存在，则将这个数字更新为当前遍历到的数字，最后返回 dp 数组的长度即可，
注意的是，跟上面的方法一样，特别注意的是 dp 数组的值可能不是一个真实的 LIS。
*/

class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        vector<int> dp;
        for (int i = 0; i < nums.size(); ++i) {
            int left = 0, right = dp.size();
            while (left < right) {
                int mid = left + (right -left) / 2;
                if (dp[mid] < nums[i]) left = mid + 1;
                else right = mid;
            }
            if (right >= dp.size()) dp.push_back(nums[i]);
            else dp[right] = nums[i];
        }
        return dp.size();
    }
};