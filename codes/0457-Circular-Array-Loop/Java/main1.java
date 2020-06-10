class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; ++i) {
        	if (visited[i]) continue;
        	visited[i] = true;
        	Map<Integer, Integer> map = new HashMap<>();
        	int cur = i;
        	while (true) {
        		int next = ((cur + nums[cur]) % n + n) % n;
        		if (next == cur || nums[cur] * nums[next] < 0) break;
        		if (map.containsKey(next)) return true;
        		map.put(cur, next);
        		cur = next;
        		visited[next] = true;
        	}
        }
        return false;
    }
}