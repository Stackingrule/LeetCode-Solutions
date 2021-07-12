class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();// 一个哈希映射
        char[] s_chars = s.toCharArray(), t_chars = t.toCharArray();
        for (int i = 0; i < s_chars.length; i++) {
            if (map.containsKey(s_chars[i]) && map.get(s_chars[i]) != t_chars[i]) return false;
            // 判断t中字符是否存在于映射中的 values 内
            if (!map.containsKey(s_chars[i]) && map.containsValue(t_chars[i])) return false;
            map.put(s_chars[i], t_chars[i]);
        }
        return true;
    }
}