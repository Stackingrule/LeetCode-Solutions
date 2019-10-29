class Solution {
private:
	double helper(vector<int>& nums1, int m, vector<int>& nums2, int n, int k) {
		if(m > n)
			return helper(nums2, n, nums1, k);
		if(m == 0)
			return nums2[k - 1];
		if(k == 1)
			return min(nums1[0], nums2[0]);

		int pa = min(k/2, m);
		int pb = k - pa;
		if(nums1[pa - 1] <= nums2[pb - 1])
			return helper(nums1 + pa, m - pa, nums2, n, k - pa);

		return helper(nums1, m, nums2 + pb, n - pb, k - pb);
	}
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
    	int m = nums1.size();
    	int n = nums2.size();
    	int total = m + n;
    	if(total % 2 == 0) {
    		return (helper(nums1, m, nums2, n, total/2) + helper(nums1, m, nums2, n, total/2 + 1))/2;
    	} 
    	return helper(nums1, m, nums2, n, total/2 + 1);
        
    }
};