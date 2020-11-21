class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int minVal = Integer.MAX_VALUE;
        
        for (int i = 0; i < n - 1; ++i) {
            minVal = Math.min(minVal, arr[i + 1] - arr[i]);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n - 1; ++i) {
            if (arr[i + 1] - arr[i] == minVal) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return ans;
    }
}