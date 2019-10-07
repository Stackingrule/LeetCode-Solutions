class Solution {
public:
	void reverse(vector<int>& nums, int low, int high) {
		int i = low, j = high;
		while(i < j) {
			swap(nums[i], nums[j]);
			i++;
			j--;
		}
	}



    void rotate(vector<int>& nums, int k) {
    	
        
    }
};