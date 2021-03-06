class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : paths) {
            String[] strs = str.split(" ");
            String path = strs[0];
            for (int i = 1; i < strs.length; i++) {
                int pos = strs[i].indexOf("(");
                String file = strs[i].substring(0, pos);
                String content = strs[i].substring(pos + 1, strs[i].length() - 1);
                if (!map.containsKey(content))
                    map.put(content, new ArrayList<>());
                map.get(content).add(path + "/" + file);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            if (e.getValue().size() > 1)
                res.add(e.getValue());
        }
        return res;
    }
}