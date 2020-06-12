class Solution {
    public int kthSmallest(int[][] matrix, int k) {
    	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    		return -1;
    	}
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> a - b);
        for (int i = 0; i < matrix.length; ++i) {
        	for (int j = 0; j < matrix[0].length; ++j) {
        		q.offer(matrix[i][j]);
        	}
        }

        int res = q.peek();
        while (k != 0) {
        	res = q.remove();
        	--k;
        }

        return res;
    }
}