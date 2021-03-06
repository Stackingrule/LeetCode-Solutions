class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> deque = new LinkedList<>();
        int len = num.length();
        for (int i = 0; i < len; ++i) {
            char digit = num.charAt(i);
            while (!deque.isEmpty() && k > 0 && deque.peekLast() > digit) {
                deque.pollLast();
                --k;
            }
            deque.offerLast(digit);
        }
        for (int i = 0; i < k; ++i) {
            deque.pollLast();
        }

        StringBuilder ans = new StringBuilder();
        boolean leadingZero = true;
        while (!deque.isEmpty()) {
            char digit = deque.pollFirst();
            if (leadingZero && digit == '0') {
                continue;
            }
            leadingZero = false;
            ans.append(digit);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
}