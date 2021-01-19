class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[][] dist = new int[n][n];
        for(int i = 0; i< n; i++) {
            for(int j =0; j <n; j++) {
                dist[i][j] = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
            }
        }
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>( (a, b) -> Integer.compare(a[2], b[2]));
        heap.offer(new int[]{0, 0, 0});
        boolean[] mst = new boolean[n];
        int selectedEdges = 0, cost  = 0;
        while(heap.size() > 0 || selectedEdges < n - 1) {
            int[] e  = heap.poll();
            int x = e[0], y = e[1], d = e[2];
            if(mst[y]) continue;
            mst[y] = true;
            cost += d;
            selectedEdges ++;
            for(int j = 0; j < n; j++) {
                if(!mst[j]) {
                    heap.offer(new int[]{y, j, dist[y][j]});
                }
            }            
        }
        return cost;     
    }
}