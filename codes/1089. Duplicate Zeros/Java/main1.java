class Solution {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        int offset = count;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i + offset < arr.length) {
                arr[i + offset] = arr[i];
            }
            if (arr[i] == 0) {
                offset--;
                if (i + offset < arr.length) {
                    arr[i + offset] = arr[i];
                }
            }
        }
    }
}