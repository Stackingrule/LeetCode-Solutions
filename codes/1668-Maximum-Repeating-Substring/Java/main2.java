class Solution {
    public int maxRepeating(String sequence, String word) {
        int len = word.length();
        int ans = 0, curr = 0;
        int idx = 0;
        while(idx < sequence.length()){
            int newIdx = sequence.indexOf(word, idx);
            if(newIdx == -1){
                return ans;
            }else if(newIdx == idx){
                curr ++;
            }else{
                ans = Math.max(ans, curr);
                curr = 1;
            }
            ans = Math.max(ans, curr);
            idx = newIdx + len;
        }
        return ans;
    }
}