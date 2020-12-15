class Solution {
    public int[] closestDivisors(int num) {
        int k = (int) Math.sqrt(num + 2);
        for (int i = k; i >= 1; --i) {
            if ((num + 1) % i == 0) return new int[]{(num + 1) / i, i};
            if ((num + 2) % i == 0) return new int[]{(num + 2) / i, i};
        }
        return new int[]{};
    }
}