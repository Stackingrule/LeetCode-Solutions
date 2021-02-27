class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        for (int h : heights) {
            freq[h]++;
        }
        int res = 0;
        int curHeight = 0;
        for (int i = 0; i < heights.length; i++) {
            while (freq[curHeight] == 0) {
                curHeight++;
            }
            if (curHeight != heights[i]) {
                res++;
            }
            freq[curHeight]--;
        }
        return res;
    }
}