class Solution {
public:
    bool isPalindrome(int x) {
            int num = x;
            int res = 0;
    	if(x < 0)
            return false;
       
    while(x) {
        if(x > 10) {
            res = res*10 + x %10;
            x  = x/10;
        }
        else {

            res = res*10 + x;
        }
        
    }
    return res == num;
    }
};