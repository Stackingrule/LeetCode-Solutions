#include <iostream>
#include <vector>

using namespace std;


class Solution {
public:
    int search(vector<int>& nums, int target) {
    	int n = nums.size();
    	int left = 0, right = n - 1;

    	while(left <= right) {
    		int mid = left + (right - left)/2;
    		if(nums[mid] == target)	return mid;
    		if(nums[mid] < nums[right]) {
    			if(nums[mid] < target && target <= nums[right]) left = mid + 1;
    			else
    				right = mid - 1;
    		} else {
    			if(nums[left] <= target && target < nums[mid]) right = mid - 1;
    			else left = mid + 1;
    		}
    	}

    	return -1;
    }
};


int main() {
	std::vector<int> v1;
	std::vector<int> v2;

	v1 = {4,5,6,7,0,1,2};
	v2 = {10, 11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7};

	Solution solve;

	cout << solve.search(v1, 5) << endl;
	cout << solve.search(v1, 10) << endl;
	cout << solve.search(v2, 1) << endl;
	cout << solve.search(v2, 10) << endl;

	return 0;
}