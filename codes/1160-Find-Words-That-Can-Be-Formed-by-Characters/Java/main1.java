class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] num = new int[26];
        int count = 0;
        getnum(chars, num);
        for (String s : words) {
            if (fit(s, num)) {
                count += s.length();
            }
        }
        return count;
    }

    public void getnum(String chars, int[] num) {
        StringBuffer str = new StringBuffer(chars);
        for (int i = 0; i < str.length(); i++) {
            num[str.charAt(i) - 'a']++;
        }
    }

    public boolean fit(String word, int[] num) {
        int[] wordnum = new int[26];
        getnum(word, wordnum);
        boolean flag = true;
        for (int i = 0; i < 26; i++) {
            if (wordnum[i] > num[i]) {
                flag = false;
            }
        }
        return flag;
    }
}