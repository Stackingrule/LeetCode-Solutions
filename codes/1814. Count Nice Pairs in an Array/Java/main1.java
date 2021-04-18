class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
            map.put(i, reverse(nums[i]));
        long cnt =0;
        HashMap<Integer, Integer> mapi = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int val = nums[i] - map.get(i);
            if(mapi.containsKey(val))
                cnt+= mapi.get(val);
            mapi.put(val, mapi.getOrDefault(val,0)+1);
        }
        return (int)(cnt%1_000_000_007);
    }
    public int reverse(int num){
        int n =0;
        while(num!=0){
            n=n*10;
            n+= num%10;
            num=num/10;
        }
        return n;
    }
}