class Solution {
    public int maxNumberOfBalloons(String text) {
        if (text == "" || text.length() < 7) {
            return 0;
        }
        int A = 0, B = 0, L = 0, O = 0, N = 0;
        int len = text.length();
        for (int i=0; i<len; i++) {
            if (text.charAt(i) == 'a') {
                A++; 
            } else if (text.charAt(i) == 'b') {
                B++;
            } else if (text.charAt(i) == 'l') {
                L++;
            } else if (text.charAt(i) == 'n') {
                N++;
            } else if (text.charAt(i) == 'o') {
                O++;
            }
        }
        L /= 2;
        O /= 2;
        int min = Math.min(A, B);
        min = Math.min(min, N);
        if (min == 0) {
            return 0;
        }
        if (L !=0 && O != 0) {
            min = Math.min(min, L);
            min = Math.min(min, O);
            return min;
        }
        return 0;
    }
}