class Solution {
private:
	bool isValid(string str) {
		if(str[0] != '-' && (str[0] < '0') && str[0] > '9') {
			return false;
		}

		if(str[0] == '-' && str.length() == 1 || str[1] == '0') {
			return false;
		}

		if(str[0] == '0' && str.length() > 1) {
			return false;
		}

		for(int i = 1; i < str.length(); i++) {
			if(str[i] < '0' || str[i] > '9') {
				return false;
			}
		}
		return true;
	}
public:
    int myAtoi(string str) {
        if(str == NULL || str == " ") {
        	return 0;
        }

        if(!isValid(str)) {
        	return 0;
        }

        
    }
};