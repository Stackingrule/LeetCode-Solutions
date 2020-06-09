class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
        	return intervals;
        }
        Arrays.sort(intervals, (l1, l2) -> {
        	return l1[0] - l2[0];
        });
        LinkedList<int[]> res = new LinkedList<>();
        for (int[] interval : intervals) {
        	if (res.isEmpty()) {
        		res.add(interval);
        	}
        	else if (res.getLast()[1] < interval[0]) {
        		res.add(interval);
        	}
        	else {
        		int[] t = res.removeLast();
        		res.add(new int[]{t[0], Math.max(t[1], interval[1])});
        	}
        }
        return res.toArray(new int[res.size()][]);
    }
}