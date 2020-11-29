class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visit = new boolean[arr.length];
        Arrays.fill(visit, false);

        return dfs(start, arr, visit);
    }

    private boolean dfs(int x, int[] arr, boolean[] visit) {
        if (arr[x] == 0) return true;

        if (x + arr[x] < arr.length && !visit[x + arr[x]]) {
            visit[x + arr[x]] = true;
            if (dfs(x + arr[x], arr, visit)) {
                return true;
            }
        }

        if (x - arr[x] >= 0 && !visit[x - arr[x]]) {
            visit[x - arr[x]] = true;
            if (dfs(x - arr[x], arr, visit)) {
                return true;
            }
        }

        return false;
    }
}