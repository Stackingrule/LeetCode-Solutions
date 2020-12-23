import java.util.Arrays;

class Solution {
    int count = 0;
    public int countArrangement(int N) {
        boolean[] visited = new boolean[N + 1];
        Arrays.fill(visited, false);
        dfs(0, N, visited);
        return count;
    }

    private void dfs(int pos, int N,  boolean[] visited) {
        if (pos == N) {
            ++count;
            return;
        }
        int curPos = pos + 1;
        for (int i = 1; i <= N; ++i) {
            if (i % curPos == 0 || curPos % i == 0) {
                if (visited[i] == false) {
                    visited[i] = true;
                    dfs(pos + 1, N, visited);
                    visited[i] = false;
                }
            }
        }
    }
}