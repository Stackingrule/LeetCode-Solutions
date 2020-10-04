class Solution {
    public int specialArray(int[] nums) {
        int[] count = new int[1001];
        for(int i : nums) {
            count[i]++;
        }
        
        int len = nums.length;
        for(int i=0; i<=100; i++){
            if(len == i) return i;
            
            len -= count[i];
        }
        return -1;
    }
}