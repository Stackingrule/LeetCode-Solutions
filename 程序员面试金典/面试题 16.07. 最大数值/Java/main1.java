class Solution {
    public int maximum(int a, int b) {
        // double c = a;
        // double d = b;
        // int res = (int) ((Math.abs(c-d) + c + d)/2);
        // return res;

        long c = a;
        long d = b;
        int res = (int) ((Math.abs(c-d) + c + d)/2);
        return res;
    }
}
