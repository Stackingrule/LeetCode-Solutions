#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>

using namespace std;

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


int main() {

    Solution solve;
    std::vector<string> v;
    std::vector<string> it;
    v = solve.generateParenthesis(3);

    int n = v.size();
    for(int i = 0; i < n; i++)
    	cout << v[i] << endl;
    cout << endl;
    return 0;


}