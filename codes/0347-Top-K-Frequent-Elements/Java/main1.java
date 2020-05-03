class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
        	map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue 
                  = new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	queue.offer(entry);
        	if (queue.size() > k) {
        		queue.poll();
        	}
        }

        int[] res = new int[k];
        int i = k;
        while (queue.size() > 0) {
        	res[--i] = queue.poll().getKey();
        }
        return res;
    }
}