class Solution {
    int random, r, c, ub;
    public Solution(int n_rows, int n_cols) {
        random = -1;
        r = n_rows;
        c = n_cols;
        ub = r*c;
    }
    
    public int[] flip() {
        random = (random + 1) % ub;
        return new int[] {(int)random/c, random%c};
    }
    
    public void reset() {
        ;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n_rows, n_cols);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */