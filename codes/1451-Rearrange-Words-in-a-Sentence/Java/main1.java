class Solution {
    public String arrangeWords(String text) {
        String[] st = text.split(" ");
        st[0] = (char) (text.charAt(0) + 32) + st[0].substring(1);
        StringBuilder sb = new StringBuilder();
        Map<Integer, List<String>> map = new HashMap();
        for (String s : st) {
            int l = s.length();
            if (map.get(l) == null) {
                map.put(l, new ArrayList());
            }
            map.get(l).add(s);
        }
        List<Integer> list = new ArrayList(map.keySet());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            List<String> t = map.get(list.get(i));
            int tt = t.size();
            for (int j = 0; j < tt; j++)
                sb.append(t.get(j)).append(" ");
        }
        String res = sb.toString().trim();
        res = (char) (res.charAt(0) - 32) + res.substring(1);
        return res;
    }
}