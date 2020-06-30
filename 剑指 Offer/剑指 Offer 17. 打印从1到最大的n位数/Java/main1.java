class Solution {
    public int[] printNumbers(int n) {
    	double length = Math.pow(10, n) - 1;
    	int[] res = new int[(int) length];
    	for (int i = 0; i < length; ++i) {
    		res[i] = i + 1;
    	}
    	return res;
    }
}