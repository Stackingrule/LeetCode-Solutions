class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length / 4;
        for (int i = 0; i + n < arr.length; ++i)
            if (arr[i] == arr[i + n])
                return arr[i];
        return -1;
    }
}