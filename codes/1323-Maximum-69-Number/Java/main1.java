class Solution {
    public int maximum69Number (int num) {
        String number = Integer.toString(num);
        char[] c = number.toCharArray();
        for(int i=0; i<c.length; i++) {
            if(c[i] == '6') {
                c[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(c));
    }
}