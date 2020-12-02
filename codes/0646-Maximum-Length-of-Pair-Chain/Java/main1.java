class Solution {
    public int findLongestChain(int[][] pairs) {
        int m = pairs.length;
        Arrays.sort(pairs, (p1, p2)->p1[0]-p2[0]);
        int count = 0;
        int pre = Integer.MIN_VALUE;
        for (int[] pair : pairs) {
            if (pair[0] > pre) {
                pre = pair[1];
                count++;
            } else if (pair[1] < pre) {
                pre = pair[1];
            }
        }
        return count;


    }
}