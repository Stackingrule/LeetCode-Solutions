class Solution {
private:
	void generateParenthesisDFS(int left, int right, string out, std::vector<string> &res) {
		if(left > right) return;
		if(left == 0 && right == 0) res.push_back(out);
		else {
			if(left > 0) generateParenthesisDFS(left - 1, right, out + '(', res);
			if(right > 0) generateParenthesisDFS(left, right - 1, out + ')', res);
		}
	}

public:
    vector<string> generateParenthesis(int n) {
    	std::vector<string> res;
    	generateParenthesisDFS(n, n, "", res);
    	return res;
        
    }
};