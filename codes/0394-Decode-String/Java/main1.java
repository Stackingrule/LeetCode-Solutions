class Solution {
    public String decodeString(String s) {
        //special case
        int len = s.length();
        if (len == 0) return "";
        //general case
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '[') {
                strStack.push(res.toString());
                res = new StringBuilder();
            } else if (c == ']') {
                int num = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int j = 0; j < num; j++) {
                    temp.append(res);
                }
                res = temp;
            } else if (Character.isDigit(c)) {
                int num = 0;
                while (i < len && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                i--;
                numStack.push(num);
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
