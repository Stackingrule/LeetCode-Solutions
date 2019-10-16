class Solution {
private:
	void reverse(string &s, int start, int end) {
		while(start < end) {
			swap(s[start], s[end]);
			start++;
			end--;
		}
	}
public:
    string reverseWords(string s) {
    	int start = 0;
        for(int i = start + 1; i <= s.size();) {
        	if(i == s.size() || s[i] == ' ') {
        		reverse(s, start, i - 1);
        		start = i + 1;
        		i = start + 1;
        	}
        	else
        		i++;
        }
        return s;
        
    }
};