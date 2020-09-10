class Solution {
    public int monotoneIncreasingDigits(int N) {
        char[] arr = String.valueOf(N).toCharArray();
        int index = -1;
        for (int i = arr.length - 2; i >= 0; --i) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = (char) ((int) arr[i] - 1);
                index = i;
            }
        }
        if (index >= 0) {
            while (index + 1 < arr.length) {
                arr[index + 1] = '9';
                index++;
            }
        }
        return Integer.valueOf(new String(arr));
    }
}