import java.util.Arrays;

import java.util.Set;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<Integer>();
        for (int a : arr) {
            set.add(a);
        }
        for (int i = 1; i <= arr[n - 1]; ++i) {
            if (!set.contains(i))
                --k;
            if (k == 0)
                return i;
        }
        return arr[n - 1] + k;
    }
}