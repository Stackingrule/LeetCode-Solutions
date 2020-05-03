/*
把有序数组从中间分成两部分，然后从前半段的末尾取一个，
在从后半的末尾去一个，这样保证了第一个数小于第二个数，
然后从前半段取倒数第二个，从后半段取倒数第二个，
这保证了第二个数大于第三个数，且第三个数小于第四个数，以此类推直至都取完
*/
class Solution {
public:
    void wiggleSort(vector<int>& nums) {
        vector<int> tmp = nums;
        sort(tmp.begin(), tmp.end());
        int n = nums.size(), k = (n + 1) / 2, j = n;
        for (int i = 0; i < n; ++i) {
        	nums[i] = i & 1 ? tmp[--j] : tmp[--k];
        }
    }
};