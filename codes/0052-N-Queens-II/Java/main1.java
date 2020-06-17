class Solution {
    private int res;
    private boolean[] col;// 列满足条件
    private boolean[] dia1;// 主对角线满足条件
    private boolean[] dia2;// 斜对角线满足条件
    public int totalNQueens(int n) {
        if(n==0){
            return res;
        }
        col = new boolean[n];
        dia1 = new boolean[2*n-1];
        dia2 = new boolean[2*n-1];
        dfs(n,0);
        return res;
    }
    private void dfs(int n, int index){
        if(index == n){
            res++;
        }
        for(int i=0;i<n;i++){
            if(!col[i] && !dia1[index+i] && !dia2[index-i+n-1]){
                col[i] = true;
                dia1[index+i] = true;
                dia2[index-i+n-1] = true;
                dfs(n,index+1);
                // 回溯
                col[i] = false;
                dia1[index+i] = false;
                dia2[index-i+n-1] = false;
            }
        }
    }
}