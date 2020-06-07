class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> resList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        int minInsexSum = Integer.MAX_VALUE, n1 = list1.length, n2 = list2.length;
        for (int i = 0; i < n1; ++i) map.put(list1[i], i);
    	for (int i = 0; i < n2; ++i) {
    		if (map.containsKey(list2[i])) {
    			int sum = i + map.get(list2[i]);
    			if (sum == minInsexSum) resList.add(list2[i]);
    			else if (sum < minInsexSum) {
    				minInsexSum = sum;
    				resList.clear();
    				resList.add(list2[i]);
    			}
    		}
    	}
    	String[] res = new String[resList.size()];
    	return resList.toArray(res);
    }
}