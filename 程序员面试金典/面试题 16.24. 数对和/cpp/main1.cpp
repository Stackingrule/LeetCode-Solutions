class Solution {
public:
    vector<vector<int>> pairSums(vector<int>& nums, int target) 
    {
        vector<vector<int>> res;
        sort(nums.begin(), nums.end());
        int start = 0, end = nums.size() - 1;
        while (start < end)
        {
            if (nums[start] + nums[end] == target) {
                res.push_back({nums[start], nums[end]});
                start++;
                end--;
            }
            else if (nums[start] + nums[end] < target)
            {
                start++;
            }
            else {
                end--;
            }
        }
        return res;
    }
};