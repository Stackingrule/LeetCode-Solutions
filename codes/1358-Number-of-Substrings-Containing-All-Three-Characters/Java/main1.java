class Solution {
    public int numberOfSubstrings(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        int cnt = 0;
        int begin = 0;
        
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'a') ++a;
            else if (s.charAt(i) == 'b') ++b;
            else ++c;

            while (a > 0 && b > 0 && c > 0) {
                cnt += s.length() - i;
                if (s.charAt(begin) == 'a') --a;
                else if (s.charAt(begin) == 'b') --b;
                else --c;
                
                ++begin;
            }
        }

        return cnt;
    }
}