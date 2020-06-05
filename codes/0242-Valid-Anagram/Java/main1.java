class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == 0 && t.length() == 0) return true;
        if (s.length() == 0 || t.length() == 0) return false;
        if (s.length() != t.length()) return false;
        int[] set = new int[26];
        for (int i = 0; i < s.length(); ++i) {
        	char ss = s.charAt(i);
        	char tt = t.charAt(i);
        	++set[ss - 'a'];
        	--set[tt - 'a'];
        }
        for (int a : set) {
        	if (a != 0)
        		return false;
        }
        return true;
    }
}