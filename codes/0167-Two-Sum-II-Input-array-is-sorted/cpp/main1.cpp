#include <iostream>
#include <vector>
#include <cassert>

using namespace std;
class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
    	int lo = 0, hi = numbers.size() - 1;
    	while(lo < hi) {
    		int sum = numbers[lo] + numbers[hi];
    		if(sum == target)
    			return { lo + 1, hi + 1};
    		else if(sum < target)
    			++lo;
    		else
    			--hi;
    	}
    	return {};
        
    }
};


void printVec(const vector<int>& vec){
    for(int e: vec)
        cout << e << " ";
    cout << endl;
}

int main() {

    int nums[] = {2, 7, 11, 15};
    vector<int> vec(nums, nums + sizeof(nums) / sizeof(int));
    int target = 9;
    printVec(Solution().twoSum(vec, target));

    return 0;
}