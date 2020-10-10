class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int y1 = coordinates[1][1] - coordinates[0][1];
        int x1 = coordinates[1][0] - coordinates[0][0];
        // double slope = ydiff / xdiff;
        for (int i = 2; i < coordinates.length; i++) {
            int y2 = coordinates[i][1] - coordinates[i - 1][1];
            int x2 = coordinates[i][0] - coordinates[i - 1][0];
            if (x1 * y2 != x2 * y1) {
                return false;
            }
        }
        return true;
    }
}