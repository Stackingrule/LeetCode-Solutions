class Solution {
    Set<Integer> matrix;
    int n_rows, n_cols ;
    int flipCount;
    public Solution(int n_rows, int n_cols) {
        matrix = new HashSet<>();
        this.n_rows = n_rows;
        this.n_cols = n_cols;
        flipCount = 0;
    }
    
    public int[] flip() {
        if(flipCount == n_rows * n_cols) return null;
        int element = (int)(Math.random() * n_rows * n_cols);
        int row = element/n_cols;
        int col = element%n_cols;
        
        if(matrix.contains(element)) return flip();
        else {
            matrix.add(element);
            flipCount++;
            return new int[] {row, col};
        }
    }
    
    public void reset() {
        matrix.clear();
        flipCount = 0;
    }
}


/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n_rows, n_cols);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */