class Solution {
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        List<Set<Integer>> topo = new ArrayList<>();
        for(int i=0;i<n;++i) {
            topo.add(new HashSet<>());
        }

        for(int[] g : graph) {
            topo.get(g[0]).add(g[1]);
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            int next = q.poll();
            if(topo.get(next).contains(target)) {
                return true;
            }

            for(int key : topo.get(next)) {
                if(!visited[key]) {
                    visited[key] = true;
                    q.offer(key);
                }
            }
        }

        return false;
    }
}