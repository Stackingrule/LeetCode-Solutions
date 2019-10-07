class Solution {
public:
    void sortColors(vector<int>& nums) {
    	int n = nums.size();
    	int i = -1, j = 0, k = n;
    	while(j < k) {
    		if(nums[j] == 0) {
    			i++;
    			swap(nums[i], nums[j]);
    			j++;
    		}
    		else if(nums[j] == 2) {
    			k--;
    			swap(nums[k], nums[j]);
    		}
    		else j++;
    	}
        
    }
};