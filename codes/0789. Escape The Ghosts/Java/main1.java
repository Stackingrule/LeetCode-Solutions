class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int dist = Math.abs(target[0]) + Math.abs(target[1]);
        for (int[] g : ghosts) {
            int t = Math.abs(g[0] - target[0]) + Math.abs(g[1] - target[1]);
            if (t <= dist)
                return false;
        }
        return true;
    }
}