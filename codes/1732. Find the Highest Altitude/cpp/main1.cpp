class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int curMax = 0;
        int curSum = 0;
        for (int n : gain) {
            curSum += n;
            if (curSum > curMax) curMax = curSum;
        }
        return curMax;
    }
};