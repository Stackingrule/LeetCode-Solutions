class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] allTrip = new int[1001];
        for (int i = 0; i < trips.length; i++) {
            for (int j = trips[i][1]; j < trips[i][2]; j++) {
                allTrip[j] += trips[i][0];
                if (allTrip[j] > capacity) {
                    return false;
                }
            }
        }
        return true;
    }
}