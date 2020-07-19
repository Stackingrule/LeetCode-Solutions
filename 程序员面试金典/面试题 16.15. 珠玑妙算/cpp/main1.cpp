class Solution {
public:
    vector<int> masterMind(string solution, string guess) {
    	unordered_map<char, int> chars;
    	int ans1 = 0, total = 0;
    	for (char c : guess) {
    		chars[c]++;
    	}
    	for (int i = 0; i < 4; ++i) {
    		if (guess[i] == solution[i]) {
    			ans1++;
    		}
    		if (chars[solution[i]]) {
    			total++;
    			chars[solution[i]]--;
    		}
    	}
    	return {ans1, total - ans1};
    }
};