class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[][] copy = new int[nums.length][2];
        for(int i=0; i< nums.length; i++){
            copy[i] = new int[]{nums[i], i};    
        }
        Arrays.sort(copy, (a, b) -> a[0]-b[0]);
        int count =0;
        for(int i=0; i<copy.length; i++){
        	nums[copy[i][1]] = count;
            if(i < copy.length-1 && copy[i][0] != copy[i+1][0]){
                count = i+1;
            }
        }
        return nums;
    }
}