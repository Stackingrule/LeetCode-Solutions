class NumArray {
    private int N;
    private int c[];
    private int[] nums;
    public NumArray(int[] nums) {
        N = nums.length;
        c = new int[N + 1];
        this.nums = nums;
        for(int i = 1; i <= N; i++) {
            add(i, nums[i-1]);
        }
    }
    
    public void update(int i, int val) {
        add(i + 1, val - nums[i]);
        nums[i] = val; //don't forget this step!
    }
    
    public int sumRange(int i, int j) {
        return sum(j+1) - sum(i);
    }
    
    private void add(int x, int y) {
        while (x <= N) {
            c[x] += y;
            x += low_bit(x);
        }
    }
    
    private int sum(int x) {
        int ans = 0;
        while (x > 0) {
            ans += c[x];
            x -= low_bit(x);
        }
        return ans;
    }
    
    private int low_bit(int x) {
        return x & -x;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */