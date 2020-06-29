class Solution {
public:
    string reverseLeftWords(string str, int n) {
        // str 非空
        if(!str.empty()){
            if(n > 0 && n <= str.size()){
                int first_left = 0;
                int first_right = n-1;
                int second_first = n;
                int second_right = str.size()-1;

                // 翻转第一部分字符串 
                Reverse(str, first_left, first_right);
                // 翻转第二部分字符串
                Reverse(str, second_first, second_right);
                // 翻转全部字符串
                Reverse(str, first_left, second_right);
            }
        }
        return str;
    }

    void Reverse(string& str, int left, int right){
        while(left < right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left ++;
            right --;
        }
    }    
};