class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
        	int j = 0, k = 0;
        	for (; j < nums2.length; ++j) {
        		if (nums1[i] == nums2[j]) break;
        	}
        	for (k = j + 1; k < nums2.length; ++k) {
        		if (nums2[k] > nums2[j]) {
        			res[i] = nums2[k];
        			break;
        		}
        	}
        	if (k == nums2.length) res[i] = -1;
        }
        return res;
    }
}