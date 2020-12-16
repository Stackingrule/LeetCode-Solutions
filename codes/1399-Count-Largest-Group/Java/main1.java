class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap();
        int freq = 0;
        for(int i = 1; i <= n; i++){
            int tmp = help(i);
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int tmp = entry.getValue();
            freq = Math.max(freq, tmp);
        }
        int res = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int tmp = entry.getValue();
            if(tmp == freq) res++;
        }
        return res;
    }
    public int help(int n){
        int res = 0;
        while(n != 0){
            int i = n % 10;
            res += i;
            n /= 10;
        }
        return res;
    }
}