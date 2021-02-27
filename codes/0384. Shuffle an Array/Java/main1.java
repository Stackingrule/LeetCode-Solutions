class Solution {

    int n;
    int[] nums, mirror;
    Random random = new Random();

    public Solution(int[] nums) {
        n = nums.length;
        this.nums = nums;
        mirror = new int[this.n];
        reset();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        for (int i = 0; i < this.n; i++)
            mirror[i] = nums[i];
        return mirror;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for (int i = this.n - 1; i >= 1; i--) {
            swap(mirror, i, random.nextInt(i + 1));
        }
        return mirror;
    }

    private void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

/**
 * Your Solution object will be instantiated and called as such: Solution obj =
 * new Solution(nums); int[] param_1 = obj.reset(); int[] param_2 =
 * obj.shuffle();
 */