/*
* 右指针左移一位（或者将左指针右移一位），略过一个相同数字，这对结果不会产生影响，因为只是去掉了一个相同的，
* 然后对剩余的部分继续用二分查找法，在最坏的情况下，比如数组所有元素都相同，时间复杂度会升到 O(n)
*/
class Solution {
public:
    int findMin(vector<int>& nums) {
        int left = 0, right = nums.size() - 1;
        while (left < right) {
        	int mid = left + (right - left) / 2;
        	if (nums[mid] > nums[right]) left = mid + 1;
        	else if (nums[mid] < nums[right]) right = mid;
        	else --right;
        }
        return nums[right];
    }
};