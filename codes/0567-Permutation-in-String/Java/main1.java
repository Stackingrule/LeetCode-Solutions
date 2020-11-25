class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 > n2) return false;
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        for (int i = 0; i < n1; i++) {
            map1[s1.charAt(i) - 'a']++;
        }
        for (int j = 0; j < n2; j++) {
            map2[s2.charAt(j) - 'a']++;
            if (j >= n1) {
                //定位到从窗口出去的那个数，减去一次occurence
                map2[s2.charAt(j - n1) - 'a']--;
            }
            if (Arrays.equals(map1, map2)) return true;
        }
        return false;
    }
}