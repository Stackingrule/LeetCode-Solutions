class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int mx = 0, n = wall.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> row : wall) {
        	int sum = 0, cnt = row.size();
        	for (int i = 0; i < cnt - 1; ++i) {
        		sum += row.get(i);
        		map.put(sum, map.getOrDefault(sum, 0) + 1);
        		mx = Math.max(mx, map.get(sum));
        	}
        }
        return n - mx;
    }
}