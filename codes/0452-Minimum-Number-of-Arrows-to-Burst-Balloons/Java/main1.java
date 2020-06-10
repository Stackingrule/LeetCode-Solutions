class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
        	return 0;
        }
        Arrays.sort(points, (a, b) -> (a[1] - b[1]));
        int res = 1, end = points[0][1];
        for (int i = 0; i < points.length; ++i) {
        	if (points[i][0] <= end) {
        		end = Math.min(end, points[i][1]);
        	}
        	else {
        		++res;
        		end = points[i][1];
        	}
        }

        return res;
    }
}