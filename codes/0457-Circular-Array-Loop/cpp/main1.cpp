class Solution {
public:
    bool circularArrayLoop(vector<int>& nums) {
        int n = nums.size();
        vector<bool> visited(n);
        for (int i = 0; i < n; ++i) {
        	if (visited[i]) continue;
        	visited[i] = true;
        	unordered_map<int, int> map;
        	int cur = i;
        	while (true) {
        		int next = ((cur + nums[cur]) % n + n) % n;
        		if (next == cur || nums[next] * nums[cur] < 0) break;
        		if (map.count(next)) return true;
        		map[cur] = next;
        		cur = next;
        		visited[next] = true;
        	}
        }
        return false;
    }
};