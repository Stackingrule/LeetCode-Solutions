class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
    	if (k == 0) {
    		return new int[0];
    	}
    	Queue<Integer> q = new PriorityQueue<>(k, (i1, i2) -> Integer.compare(i2, i1));
    	for (int a : arr) {
    		if (q.isEmpty() || q.size() < k || a < q.peek()) {
    			q.offer(a);
    		}
    		if (q.size() > k) {
    			q.poll();
    		}
    	}

    	int[] res = new int[q.size()];
    	int i = 0;
    	for (int a : q) {
    		res[i++] = a;
    	}
    	return res;
    }
}