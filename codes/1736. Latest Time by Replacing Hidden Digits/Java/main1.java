class Solution {
    public String maximumTime(String time) {
        StringBuilder result = new StringBuilder();

        char one = time.charAt(0);
        char two = time.charAt(1);
        char three = time.charAt(3);
        char four = time.charAt(4);

        // 当one等于'?'时
        if (one == '?') {
            // two等于'?'
            if (two == '?') {
                result.append('2').append('3').append(':');
                // two不等于'?'
            } else {
                // two < '4'
                if (two < '4') {
                    result.append('2').append(two).append(':');
                    // two >= '4'
                } else {
                    result.append('1').append(two).append(':');
                }
            }
            // one等于'2'
        } else if (one == '2') {
            // two等于'?'
            if (two == '?') {
                result.append(one).append('3').append(':');
                // two不等于'?'
            } else {
                result.append(one).append(two).append(':');
            }
            // one等于'0'或'1'
        } else {
            // two等于'?'
            if (two == '?') {
                result.append(one).append('9').append(':');
                // two不等于'?'
            } else {
                result.append(one).append(two).append(':');
            }
        }

        // 当three等于'?'时
        if (three == '?') {
            result.append('5');
        } else {
            result.append(three);
        }

        // 当four等于'?'时
        if (four == '?') {
            result.append('9');
        } else {
            result.append(four);
        }

        return result.toString();
    }
}