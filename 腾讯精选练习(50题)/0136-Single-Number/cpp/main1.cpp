/// Using the attribution of xor operation:
/// a ^ 0 = a
/// a ^ a = 0
///
/// Time Complexity: O(n)
/// Space Complexity: O(1)
class Solution {
public:
    int singleNumber(vector<int>& nums) {

        assert(nums.size()%2 == 1);

        int res = 0;
        for(int i = 0 ; i < nums.size() ; i ++)
            res ^= nums[i];
        return res;
    }
};
