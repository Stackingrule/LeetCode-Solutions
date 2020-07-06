class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i]-1>=0 && nums[i]-1<nums.length && nums[i]!=nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
                i--;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != i+1){
                res.add(nums[i]);
            }
        }

        return res;
    }

    private void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}