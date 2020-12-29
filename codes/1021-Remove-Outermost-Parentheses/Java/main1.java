class Solution {
    public String removeOuterParentheses(String S) {
        int count = 0, start = 0;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i)== '(') count++;
            else if(S.charAt(i) == ')') count--;
            
            if(count == 0){
                String temp = S.substring(start, i + 1);
                temp = temp.substring(1, temp.length() - 1);
                sb.append(temp);
                start = i + 1;
            }
        }
        return sb.toString();
    }
}