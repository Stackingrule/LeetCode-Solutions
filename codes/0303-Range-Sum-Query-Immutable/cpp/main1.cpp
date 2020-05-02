class NumArray {
public:
    NumArray(vector<int>& nums) {
        int sum = 0;
        for (int num : nums) {
        	sum += num;
        	sums.push_back(sum);
        }
    }
    
    int sumRange(int i, int j) {
        return nums[j + 1] - nums[i];
    }

private:
	vector<int> sums{0};
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(i,j);
 */