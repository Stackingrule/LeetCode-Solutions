class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length() - 9; ++i) {
        	String subString = s.substring(i, i + 10);
        	if (map.containsKey(subString)) {
        		int count = map.get(subString);
        		if (count == 1) {
        			map.remove(subString);
        			map.put(subString, 2);
        			res.add(subString);
        		}
        	}
        	else {
        		map.put(subString, 1);
        	}
        }

        return res;
    }
}