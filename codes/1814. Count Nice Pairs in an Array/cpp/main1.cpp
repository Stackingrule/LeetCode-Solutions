class Solution {
public:
    int countNicePairs(vector<int>& nums) {
        const int mod = 1e9 + 7;
        unordered_map<int, int> m;
        long ans = 0;
        for (int num : nums)
        {
            string s = to_string(num);
            reverse(s.begin(), s.end());
            ans += m[num - stoi(s)]++;
        }
        return ans % mod;
        
    }
};