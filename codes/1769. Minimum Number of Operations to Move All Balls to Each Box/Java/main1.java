class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        int cnt = 0;
        int val = 0;
        for(int i = 0; i < boxes.length(); i++) {
            val += cnt;
            ans[i] += val; 
            if(boxes.charAt(i) == '1') cnt++; 
        }
        cnt = 0;
        val = 0;
        for(int i = boxes.length() - 1; i >= 0; i--) {
            val += cnt;
            ans[i] += val;
            if(boxes.charAt(i) == '1') cnt++;
        }
        return ans;
    }
}