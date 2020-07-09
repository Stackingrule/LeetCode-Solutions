class Solution {
public:
    int respace(vector<string>& dictionary, string sentence) {
        if(sentence.empty())
            return 0;
    	int i, j, n = sentence.size();
        unordered_set<string> s;
        vector<int> dp(n,INT_MAX);
    	for(auto& d : dictionary)
    		s.insert(d);
        for(i = 0; i < n; ++i)
        {
            dp[i] = i+1;
            if(s.count(sentence.substr(0,i+1)))
            {
                dp[i] = 0;
                continue;
            }
            for(j = i; j > 0; --j)
            {
                if(s.count(sentence.substr(j,i-j+1)))
                    dp[i] = min(dp[i], dp[j-1]);
                else
                    dp[i] = min(dp[i], dp[j-1]+i-j+1);
                if(dp[i]==0)
                    break;
            }
        }
        return dp[n-1];
    }
};
