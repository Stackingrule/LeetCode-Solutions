class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int, int> p;
        int n = nums.size();
        for(auto num : nums)
        {
            if (++p[num] > n/2)
            {
                return num;
            }
        }

        return -1;
    }
};