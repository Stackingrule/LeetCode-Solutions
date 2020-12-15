import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (map.get(arr[i]) == arr[i])
                return arr[i];
        }
        return -1;
    }
}