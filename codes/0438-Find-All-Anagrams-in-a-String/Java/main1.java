class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length())
            return result;

        int mark[] = new int[26];
        for (char c : p.toCharArray())
            mark[c - 'a']++;

        int start = 0, end = 0, count = 0;
        while (end < s.length()) {
            if (--mark[s.charAt(end++) - 'a'] >= 0)
                count++;
            if (count == p.length())
                result.add(start);
            if (end - start == p.length() && ++mark[s.charAt(start++) - 'a'] > 0)
                count--;
        }
        return result;
    }
}
