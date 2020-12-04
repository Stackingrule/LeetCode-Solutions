class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int N = graph.length;
        List<List<Integer>> rgraph = new ArrayList<List<Integer>>();

        for(int i = 0; i<N; i++){
            rgraph.add(new ArrayList<Integer>());
        }

        LinkedList<Integer> que = new LinkedList<Integer>();
        int [] outDegrees = new int[N];

        for(int i = 0; i<N; i++){
            outDegrees[i] = graph[i].length;

            if(graph[i].length == 0){
                que.add(i);
                continue;
            }

            for(int target : graph[i]){
                rgraph.get(target).add(i);
            }
        }

        List<Integer> res = new ArrayList<Integer>();
        while(!que.isEmpty()){
            int cur = que.poll();
            res.add(cur);
            for(int source : rgraph.get(cur)){
                outDegrees[source]--;
                if(outDegrees[source] == 0){
                    que.add(source);
                }
            }
        }

        Collections.sort(res);
        return res;
    }
}