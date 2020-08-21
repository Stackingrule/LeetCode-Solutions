class Solution {

    private void quickSort(int[] a, int l, int r){
        if (l >= r) return;

        int t = a[(l + r) >>> 1];
        int i = l - 1;
        int j = r + 1;
        while (i < j){
            while (a[++i] < t);
            while (a[--j] > t);
            if (i < j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        quickSort(a, l, j);
        quickSort(a, j + 1, r);
    }

    public int[] sortArray(int[] nums) {        
        int n = nums.length;
        quickSort(nums, 0, n - 1);
        return nums;
    }
}