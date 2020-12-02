class Solution {
    public boolean isPossible(int[] nums) {
        if(nums.length<=2)
            return false;
        int[] rec=new int[nums.length/3+1];
        int recHead=0,recTail=1;
        int recIndex=0;
        rec[0]=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                if(recIndex != recTail-1){
                    rec[recIndex--]++;
                    if(recIndex<recHead)recIndex = recTail-1;
                }else if(recTail>=rec.length){
                    return false;
                }else{
                    rec[recTail]=1;
                    recIndex = (++recTail)-1;
                }
            }else if(nums[i]!=nums[i-1]+1){
                for(int j=recHead;j<recTail;j++){
                    if(rec[j]<3){
                        return false;
                    }
                }
                return isPossible(Arrays.copyOfRange(nums,i,nums.length));
            }else if(recIndex==recTail-1){
                rec[recIndex--]++;
                if(recIndex<recHead)recIndex=recTail-1;
            }else{
                while(recHead!=recIndex+1){
                    if(rec[recHead]<3){
                        return false;
                    }
                    recHead++;
                }
                recIndex=recTail-1;
                rec[recIndex--]++;
                if(recIndex<recHead){
                    recIndex=recTail-1;
                }
            }
        }
        for(int j=recTail-1;j>=recHead;j--){
            if(rec[j]<3)return false;
        }
        return true;
    }
}