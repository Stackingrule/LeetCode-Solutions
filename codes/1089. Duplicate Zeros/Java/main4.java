class Solution {
    public void duplicateZeros(int[] arr) {
        int cnt = 0;    // count zeros
        for(int n : arr) {
            if(n == 0) {
                cnt++;
            }
        }
        
        int n = arr.length + cnt;
        int i = n - 1, j = arr.length - 1;
        while(i >= 0 && j >= 0) {
            if(arr[j] == 0) {
                if(i < arr.length) {
                    arr[i] = 0;
                }
                i--;
                if(i < arr.length) {
                    arr[i] = 0;
                }
            } else {
                if(i < arr.length) {
                    arr[i] = arr[j];
                }
            }
            i--;
            j--;
        }
    }
}