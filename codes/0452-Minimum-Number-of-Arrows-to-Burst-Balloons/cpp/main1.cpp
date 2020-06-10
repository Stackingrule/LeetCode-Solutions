class Solution {
public:

	static bool cmp(vector<int> &a, vector<int> &b) {
		return a[1] < b[1];
	}

    int findMinArrowShots(vector<vector<int>>& points) {
        if (points.empty()) return 0;
        sort(points.begin(), points.end(), cmp);
        int res = 1, end = points[0][1];
        for (int i = 0; i < points.size(); ++i) {
        	if (points[i][0] <= end) {
        		end = min(end, points[i][1]);
        	}
        	else {
        		++res;
        		end = points[i][1];
        	}
        }

        return res;
    }
};