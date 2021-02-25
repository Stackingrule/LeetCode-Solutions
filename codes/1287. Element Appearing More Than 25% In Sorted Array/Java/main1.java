class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length / 4;
        for (int i = 0; i + s < arr.size(); ++i)
        if (arr[i] == arr[i + s]) return arr[i];
        return -1;
    }
}