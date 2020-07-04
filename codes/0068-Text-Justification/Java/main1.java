class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        if (words == null || words.length == 0) {
            return res;
        }

        for (int index = 0; index < words.length; ) {
            StringBuilder buff = new StringBuilder();
            int count = words[index].length();
            int last = index + 1;
            while (last < words.length && count + 1 + words[last].length() <= maxWidth) {
                count += 1 + words[last].length();
                last++;
            }

            int diff = last - index - 1;
            if (last == words.length || diff == 0) {
                for (int i = index; i < last; i++) {
                    buff.append(words[i] + ' ');
                }
                buff.deleteCharAt(buff.length() - 1);
                for (int i = buff.length() + 1; i <= maxWidth; i++) {
                    buff.append(' ');
                }
            } else {
                int spaces = (maxWidth - count) / diff;
                int left = (maxWidth - count) % diff;
                for (int i = index; i < last; i++) {
                    buff.append(words[i]);
                    if (i < last - 1) {
                        for (int j = 0; j <= spaces + (i - index < left ? 1 : 0); j++) {
                            buff.append(' ');
                        }
                    }
                }
            }

            res.add(buff.toString());
            index = last;
        }

        return res;
    }
}