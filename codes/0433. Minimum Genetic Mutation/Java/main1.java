class Solution {
    public int minMutation(String start, String end, String[] bank) {
        if (bank == null || bank.length == 0) return -1;
        int level = 0;
        char[] gens = {'A', 'C', 'G', 'T'};
        Queue<String> q = new LinkedList<>();
        Set<String> bankSet = new HashSet<>();
        Set<String> visited = new HashSet<>();
        for (String s : bank) {
            bankSet.add(s);
        }
        q.offer(start);
        while (!q.isEmpty()) {
            for (int i = q.size(); i > 0; --i) {
                String t = q.poll();
                if (t.equals(end)) return level;
                char[] next = t.toCharArray();
                for (int j = 0; j < next.length; ++j) {
                    char old = next[j];
                    for (char c : gens) {
                        next[j] = c;
                        String nextStr = new String(next);
                        if (bankSet.contains(nextStr) && !visited.contains(nextStr)) {
                            visited.add(nextStr);
                            q.offer(nextStr);
                        }
                    }
                    next[j] = old;
                }
            }
            ++level;
        }
        return -1;
    }
}