class Solution {
    public String makeGood(String s) {
        char[] ch = s.toCharArray();
        while (true) {
            boolean haspal = false;
            for (int i = 0; i < ch.length - 1; i++) {
                int j = i + 1;
                while (j < ch.length && ch[j] == '#')
                    j++;
                if (j < ch.length && ch[j] != ch[i] && Character.toLowerCase(ch[i]) == Character.toLowerCase(ch[j])) {
                    ch[i] = '#';
                    ch[j] = '#';
                    haspal = true;
                }
            }
            if (!haspal)
                break;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '#')
                sb.append(ch[i]);
        }
        return sb.toString();
    }
}