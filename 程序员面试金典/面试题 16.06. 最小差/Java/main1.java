class Solution {
    public int smallestDifference(int[] a, int[] b) {
    	Arrays.sort(a);
    	Arrays.sort(b);
    	int res = Integer.MIN_VALUE;
    	for (int i = 0, j = 0; i < a.length && j < b.length; ) {
    		res = Math.max(res, -Math.abs(a[i] - b[j]));
    		if (a[i] < b[j]) {
    			i++;
    		}
    		else {
    			j++;
    		}
    	}
    	return Math.abs(res);
    }
}