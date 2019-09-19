/*
	代码1
*/
class Solution {
public:
    bool isValid(string s) {
    	stack<char> st;
    	for(int i = 0; i < s.size(); i++) {
    		if(s[i] == '(' || s[i] == '[' || s[i] == '{') {
    			st.push(s[i]);
    		}
    		else {
    			if(st.size() == 0) 
    				return false;
    			char c = st.top();
    			st.pop();
    			if(s[i] == ')') {
    				if(c != '(')
    					return false;
    			} else if(s[i] == ']') {
    				if(c != '[')
    					return false;
    			} else if(s[i] == '}') {
    				if(c != '{')
    					return false;
    			}
    		}
    	}
    	if(st.size() != 0)
    		return false;
    	return true;
    }
};


/*
	代码2
 */
class Solution {
public:
    bool isValid(string s) {
    	stack<char> stackValue;
    	for(int i = 0; i < s.size(); i++) {
    		if(s[i] == '(' || s[i] == '[' || s[i] == '{')
    			stackValue.push(s[i]);
    		else {
    			if(s.size() == 0)
    				return false;
    			char c = stackValue.top();
    			stackValue.pop();

    			char match;
    			if(s[i] == ')') {
    				match = '(';
    			}
    			else if(s[i] == ']') {
    				match = '[';
    			}
    			else if(s[i] == '}') {
    				match = '{';
    			}

    			if(c != match) {
    				return false;
    			}
    		}
    	}
    	
    	if(stackValue.size() != 0)
    		return false;

		return true;    
    }
};