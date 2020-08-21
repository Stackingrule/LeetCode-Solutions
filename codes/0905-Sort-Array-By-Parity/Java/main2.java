class Solution {
    public int[] sortArrayByParity(int[] A) {

        int n = A.length;
        int l = 0, r = n - 1, b = 0;
        while (l <= r){
            if ((A[l] & 1) == 0){
                swap(A, l++, b++);
            } else {
                swap(A, l, r--);
            }
        }
        return A;
    }

    private void swap(int[] a, int l, int r){
        int t = a[l];
        a[l] = a[r];
        a[r] = t;
    }
}