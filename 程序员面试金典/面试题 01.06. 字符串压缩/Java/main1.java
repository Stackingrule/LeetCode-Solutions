class Solution {
    public String compressString(String S) {
        // 有空字符串出没
        if(S.length() == 0) return S;

        // 用两个变量记录
        char ch = S.charAt(0);
        int times = 0;

        // 模拟压缩过程
        String ans = "";
        for(char c: S.toCharArray()){
            if(c != ch){
                ans += ch;
                ans += times;
                ch = c;
                times = 1;
            }else{
                times ++;
            }
        }

        //原字符串最后字符会漏掉，这里加上
        ans += ch;
        ans += times;
        
        //如果没有压缩则返回原字符串
        if(ans.length() >= S.length()) return S;
        return ans;

    }
}
