class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
       int N = graph.length;
       int[] color = new int[N];
       List<Integer> res = new ArrayList<>();
       for (int i = 0; i < N; i++) {
           if (dfs(i, color, graph))
               res.add(i);
       }
       return res;
   }
   private boolean dfs(int i, int[] color, int[][] graph) {
       if (color[i] > 0) {
           return color[i] == 2;
       }
       
       color[i] = 1;
       for (int neighbor : graph[i]) {
           if (color[neighbor] == 2) continue;
           
           if (color[neighbor] == 1 || !dfs(neighbor, color, graph)) 
               return false;
       }
       color[i] = 2;
       return true;
   }
}