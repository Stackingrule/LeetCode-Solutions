class Solution {

    private void mergeSort(int[] a, int l, int r){
        if (l >= r) return;

        int mid = (l + r) >>> 1;
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);

        int k = 0, i = l, j = mid + 1;
        int[] tmp = new int[r - l + 1];
        while (i <= mid && j <= r){
            if (a[i] <= a[j]) tmp[k++] = a[i++];
            else tmp[k++] = a[j++];
        }
        while (i <= mid) tmp[k++] = a[i++];
        while (j <= r)   tmp[k++] = a[j++];
        for (int m = l, n = 0; m <= r; m++, n++){
            a[m] = tmp[n];
        }
    }

    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n - 1);
        return nums;
    }
}