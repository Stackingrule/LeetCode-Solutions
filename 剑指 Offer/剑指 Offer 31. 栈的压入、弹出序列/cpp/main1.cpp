class Solution {
public:
    bool validateStackSequences(vector<int>& pushed, vector<int>& popped) {
    	stack<int> st;
    	int popIndex = 0;
    	for (int i = 0; i < pushed.size(); ++i) {
    		st.push(pushed[i]);
    		while (!st.empty() && st.top() == popped[popIndex]) {
    			popIndex++;
    			st.pop();
    		}
    	}

    	return popIndex == pushed.size();
    }
};