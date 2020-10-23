class Solution {
    public int openLock(String[] deadends, String target) {
        
        Set<String> set = new HashSet<>();
        for(String end : deadends) {
            set.add(end);
        }
        if(set.contains("0000")) return -1;
        
        Queue<String> q = new LinkedList<>();
        q.offer("0000"); // start with "0000"
        int step = 0;
        
        Set<String> visited = new HashSet<>();
        
        while(!q.isEmpty()) {
            step += 1; // increment number of steps needed
            int size = q.size();
            for(int i=0; i<size; i++) {
                String curr = q.poll();
                if(curr.equals(target)) return step-1; // ignore the increment added for "0000"
                if(!visited.contains(curr)) {
                    visited.add(curr); // add in visited set to avoid explored paths
                    List<String> nextMoves = generateMoves(curr, set);
                    for(String move : nextMoves) {
                        q.offer(move);
                    }
                }
            }
        }
        
        return -1; // failed to reach target
    }
    
    public List<String> generateMoves(String s, Set<String> set) {
        List<String> res = new ArrayList<>();
        char[] a = s.toCharArray();
        
        for(int i=0; i<4; i++) {
            char c = a[i];
            
            // generate forward move
            a[i] = c == '9' ? '0' : (char)(c + 1);
            String forwardStr = new String(a);
            // generate backward move
            a[i] = c == '0' ? '9' : (char)(c - 1);
            String backwardStr = new String(a);
            a[i] = c;
            
            if(!set.contains(backwardStr)) res.add(backwardStr);
            if(!set.contains(forwardStr)) res.add(forwardStr);
        }
        return res;
    }
}