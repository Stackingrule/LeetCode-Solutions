class Solution {
    public int result = 0;
    public int reversePairs(int[] nums) {
        if(nums == null || nums.length == 1) return 0;
        mergeCount(nums,0,nums.length-1);
        return result;
    }

    public void mergeCount(int[] nums, int left, int right){
        if(nums.length < 2 || nums == null || left == right) return ;
        int mid = left + (right-left)/2;
        mergeCount(nums,left,mid);
        mergeCount(nums,mid+1,right);
        merge(nums,left,mid,right);

    }

    public void merge(int[] nums,int left, int mid, int right){
        int[] help = new int[right-left+1];
        int p = help.length-1;
        int temp = mid+1;
        while(mid >= left && right >= temp){
            //记录下当前两个有序数组中的逆序对个数
            result = nums[mid] > nums[right] ? result+right-temp+1 : result;
            help[p--] = nums[mid] > nums[right] ? nums[mid--] : nums[right--];
        }
        while(mid >= left) help[p--] = nums[mid--];
        while(right >= temp) help[p--] = nums[right--];
        for(int i = 0; i<help.length; i++) nums[left+i] = help[i];
    }
}
