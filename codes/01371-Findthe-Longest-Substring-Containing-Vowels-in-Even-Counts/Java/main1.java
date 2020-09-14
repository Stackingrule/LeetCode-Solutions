class Solution {
    public int findTheLongestSubstring(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int best = 0, curr = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
              || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                int diff = s.charAt(i) - 'a';
                curr ^= (1 << diff);
            }
            map.putIfAbsent(curr, i);
            best = Math.max(best, i - map.get(curr));
        }
        return best;
    }
}