class Solution {
    public int[] constructRectangle(int area) {
        int r = (int)Math.sqrt(area);
        while (area % r != 0) --r;
        return int[] { area / r, r };
    }
}