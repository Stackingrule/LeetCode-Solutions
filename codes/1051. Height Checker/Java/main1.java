class Solution {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] sorted = new int[len];
        for (int i = 0; i < len; i++) {
            sorted[i] = heights[i];
        }
        Arrays.sort(sorted);

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (sorted[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}