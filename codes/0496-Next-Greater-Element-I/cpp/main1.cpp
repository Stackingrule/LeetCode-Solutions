class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> res(nums1.size());
        for (int i = 0; i < nums1.size(); ++i) {
        	int j = 0, k = 0;
        	for (; j < nums2.size(); ++j) {
        		if (nums1[i] == nums2[j]) break;
        	}
        	for (k = j + 1; k < nums2.size(); ++k) {
        		if (nums2[k] > nums2[j]) {
        			res[i] = nums2[k];
        			break;
        		}
        	}
        	if (k == nums2.size()) res[i] = -1;
        }
        return res;
    }
};