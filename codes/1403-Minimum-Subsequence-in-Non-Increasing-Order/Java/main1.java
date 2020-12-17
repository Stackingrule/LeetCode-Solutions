class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int[] hash=new int[101];
        int sum=0;
        for(int i : nums){
            sum+=i;
            hash[i]++;
        }
        List<Integer> result=new ArrayList<Integer>();
        int temp=0;
        for(int i=100;i>=1;i--){
            while(hash[i]>0){
                temp+=i;
                hash[i]--;
                result.add(i);
                if(temp>sum-temp)
                    return result;
            }
        }
        return result;
    }
}
