class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
      vector<int> res;
      if (nums.empty()) {
        return res;
      }
      int i = 0, j = nums.size() - 1;
      while (i < j) {
        int sum = nums[i] + nums[j];
        if (sum  == target) {
          res.push_back(nums[i]);
          res.push_back(nums[j]);
          return res;
        }
        else if (sum < target) ++i;
        else --j;
      }
      return res;

    }
};