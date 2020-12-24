class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < pieces.length; i++) {
            map.putIfAbsent(pieces[i][0], i);
        }
        int i = 0;
        while (i < arr.length) {
            if (!map.containsKey(arr[i]))
                return false;
            int[] cur = pieces[map.get(arr[i])];
            for (int c : cur) {
                if (c != arr[i++]) {
                    return false;
                }
            }
        }
        return true;
    }
}