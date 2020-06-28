class Solution {
    public int strToInt(String str) {
        str = str.trim();
        if (str.length()==0) {
            return 0;
        }
        int res = 0;
        int sig = 1;
        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            if (str.charAt(0) == '-') {
                sig = -1;
            }
            str = str.substring(1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                int temp = str.charAt(i) - '0';
                if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && temp > 7)) {
                    return sig==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                res = res * 10 + temp;
            } else {
                break;
            }
        }
        return res * sig;
    }

}