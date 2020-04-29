class Solution {
    public int lastStoneWeight(int[] stones) {
    	if (stones == null) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int s : stones) {
        	pq.offer(s);
        }
        while (pq.size() >= 2) {
        	int first = pq.poll();
        	int second = pq.poll();
        	if (first  != second) {
        		pq.offer(Math.abs(first - second));
        	}
        }
        return pq.size() == 1 ? pq.poll() : 0;
    }
}