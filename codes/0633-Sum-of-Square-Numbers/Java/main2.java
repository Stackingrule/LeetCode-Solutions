class Solution {
    public boolean judgeSquareSum(int c) {
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i <= (int) Math.sqrt(c); ++i) {
            map.add(i * i);
            if (map.contains(c - i * i)) {
                return true;
            }
        }
        return false;
    }
}