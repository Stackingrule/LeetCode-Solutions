class Solution {
public:
    int bestTeamScore(vector<int>& scores, vector<int>& ages) {
        const int n = scores.size();
        vector<pair<int, int>> palyers(n);
        for (int i = 0; i < n; ++i) {
            palyers[i] = {ages[i], scores[i]};
        }
        sort(begin(palyers), end(palyers));
        int ans = 0;
        vector<int> dp(n);
        for (int i = 0; i < n; ++i) {
            dp[i] = palyers[i].second;
            for (int j = 0; j < i; ++j) {
                if (palyers[i].second >= palyers[j].second)
                    dp[i] = max(dp[i], dp[j] + palyers[i].second);
            }
            ans = max(ans, dp[i]);
        }
        return ans;
    }
};