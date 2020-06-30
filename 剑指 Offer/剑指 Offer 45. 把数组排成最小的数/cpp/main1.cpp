class Solution {
public:

	static bool compare(const string &s1, const string &s2) {
		string str1 = s1 + s2;
		string str2 = s2 + s1;
		return str1 < str2;
	}

    string minNumber(vector<int>& nums) {
    	string res;
    	if (nums.size() < 0) {
    		return res;
    	}

    	vector<string> strNum;
    	for (int i = 0; i < nums.size(); ++i) {
    		stringstream ss;
    		ss << nums[i];
    		string s = ss.str();
    		strNum.push_back(s);
    	}

    	sort(strNum.begin(), strNum.end(), compare);
    	for (int i = 0; i < strNum.size(); ++i) {
    		res.append(strNum[i]);
    	}
    	return res;
    }
};