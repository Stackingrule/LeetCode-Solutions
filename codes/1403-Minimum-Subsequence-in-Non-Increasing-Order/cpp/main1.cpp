class Solution {
public:
    vector<int> minSubsequence(vector<int>& nums) {
        int sum = accumulate(nums.begin(), nums.end(), 0);
        sort(nums.rbegin(), nums.rend());
        vector<int> res;
        int sum_res = 0;
        int i = 0;
        while (sum_res <= sum - sum_res && i < nums.size()) {
            res.push_back(nums[i]);
            sum_res += nums[i];
            i ++;
        }
        return res;
    }  
};