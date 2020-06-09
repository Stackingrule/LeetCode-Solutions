class Solution {
    public String[] findWords(String[] words) {
        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; ++i) {
        	for (char c : strs[i].toCharArray()) {
        		map.put(c, i);
        	}
        }
        List<String> res = new LinkedList<>();
        for (String word : words) {
        	if (word.equals("")) continue;
        	int index = map.get(word.toUpperCase().charAt(0));
        	for (char c : word.toUpperCase().toCharArray()) {
        		if (map.get(c) != index) {
        			index = -1;
        			break;
        		}
        	}
        	if (index != -1) {
        		res.add(word);
        	}
        }
        return res.toArray(new String[0]);
    }
}