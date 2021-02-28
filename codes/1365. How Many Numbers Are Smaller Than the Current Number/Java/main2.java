class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer>[] numToPos = new ArrayList[101];
        
        for(int i=0; i< nums.length; i++){
            if(numToPos[nums[i]] == null) numToPos[nums[i]] = new ArrayList<>();
            numToPos[nums[i]].add(i);
        } 

        int count =0;
        for(int i=0; i< numToPos.length; i++){
            if(numToPos[i] != null){
                for(int pos: numToPos[i]){
                    nums[pos] = count;
                }
                count+=numToPos[i].size();
            }
        }
        
        return nums;
    }
}