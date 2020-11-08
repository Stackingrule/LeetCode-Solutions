class Solution {
    public String replaceSpaces(String S, int length) {
        char[] cs = new char[length * 3];
        int i = 0, j = 0;
        char c;
        while(i < length){
            c = S.charAt(i);
            if(c == ' '){
                cs[j++] = '%';
                cs[j++] = '2';
                cs[j++] = '0';
            } else {
                cs[j++] = c;
            }
            i++;
        }
        return new String(cs, 0, j);
    }
}