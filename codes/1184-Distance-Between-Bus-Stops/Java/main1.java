class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n = distance.length;
        int tot = 0;
        for (int i = 0; i < n; ++i) {
            tot += distance[i];
        }
        int ans = 0;
        while (start != destination) {
            ans += distance[start];
            start++;
            if (start == n) {
                start = 0;
            }
        }
        return Math.min(ans, tot - ans);
    }
}