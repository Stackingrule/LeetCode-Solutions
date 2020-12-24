class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        char[] ch = s.toCharArray();
        int count = 0;
        int count1 = -1;
        int max = 0;
        boolean flag = false;
        for (int i = 0; i < ch.length; i++) {
            count = 0;
            count1 = -1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] != ch[j]) {
                    count++;
                } else {
                    flag = true;
                    count1++;
                    if (count + count1 > max) {
                        max = count + count1;
                    }
                }
            }
        }
        if (flag) {
            return max;
        }
        return -1;

    }
}