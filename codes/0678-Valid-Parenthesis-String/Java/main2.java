class Solution {
    public boolean checkValidString(String s) {
        int min = 0; //least number of ')' to balance
        int max = 0; //largest number of ')' to balance
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(') {
                ++min;
                ++max;
            } else if (c == ')') {
                --min;
                --max;
                if (max < 0) {
                    //more ')' than '(' + '*'
                    return false;
                }
            } else if (c == '*') {
                --min;
                ++max;
            } 
            
            if (min < 0) {
                //in previous characters, a '*' is used to balance '(' while it should be empty
                min = 0;
            }
        }
        return min == 0;
    }
}