class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] counter = new int[1001];
        for (int i = 0; i < trips.length; i++) {
            counter[trips[i][1]] += trips[i][0];
            counter[trips[i][2]] -= trips[i][0];
        }
        int cap = 0;
        for (int i = 0; i < 1001; i++) {
            cap += counter[i];
            if (cap > capacity) {
                return false;
            }
        }
        return true;
    }
}