class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        int n = routes.length;
        // HashMap to know, which stops to travel from a bus
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            for (int j: routes[i]) {
                if (!map.containsKey(j))
                    map.put(j, new HashSet<Integer>());
                map.get(j).add(i);
            }
        }
        // required to push every next stop int (stop, bus) format
        Queue<int[]> que = new ArrayDeque<>();
        que.offer(new int[] {source, 0});
        // set to check if stop is already visited or not
        HashSet<Integer> seen = new HashSet<>();
        seen.add(source);
        // to check if bus is already visited or not
        boolean[] busVisited = new boolean[n];
        
        // BFS
        while (!que.isEmpty()) {
            int stop = que.peek()[0], bus = que.peek()[1];
            que.poll();
            
            // if current stop is target then return bus
            if (stop == target) return bus;
            
            for (int i: map.get(stop)) {        // getting bus number
                if (busVisited[i]) continue;    // if bus is already visited
                for (int j: routes[i]) {        // travelling on each stop from the current bus number
                    if (!seen.contains(j)) {    // if stop is already visited
                        seen.add(j);            // marking current stop is visited
                        que.offer(new int[] {j, bus + 1});
                    }
                }
                // marking the current bus as visited
                busVisited[i] = true;
            }
        }
        return -1;  // if there exist no path to target
    }
}