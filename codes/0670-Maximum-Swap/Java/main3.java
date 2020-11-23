class Solution {
    public int maximumSwap(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for(int i = 0; i < arr.length; ++i) {
            int maxIndex = i;
            for(int j = arr.length-1; j > i; --j) {
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            if(maxIndex > i) {
                char t = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = t;
                return Integer.valueOf(new String(arr));
            }
        }
        return num;
    }
}