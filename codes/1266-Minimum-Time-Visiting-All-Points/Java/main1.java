class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int rows = points.length;
        int minTime = 0;
        for (int i = 0; i < rows - 1; ++i) {
            int xdiff = Math.abs(points[i][0] - points[i + 1][0]);
            int ydiff = Math.abs(points[i][1] - points[i + 1][1]);
            minTime += Math.max(xdiff, ydiff);
        }
        return minTime;
    }
}