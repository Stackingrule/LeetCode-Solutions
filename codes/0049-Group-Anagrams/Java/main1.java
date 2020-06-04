class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
        	return new ArrayList<>();
        }
        Arrays.sort(strs);
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
        	char[] chars = str.toCharArray();
        	// 将char数组按照字典顺序排序
        	Arrays.sort(chars);
        	String sortStr = String.valueOf(chars);
        	// 排序后的String作为key，
        	if (!map.containsKey(sortStr)) {
        		map.put(sortStr, new ArrayList<>());
        	}
        	map.get(sortStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}