class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : arr) map.put(item, map.getOrDefault(item, 0) + 1);
        return map.size() == new HashSet<Integer>(map.values()).size();
    }
}