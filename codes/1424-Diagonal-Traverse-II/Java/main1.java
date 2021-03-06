class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int length = 0;
        // 根据对角线i+j唯一且相同，LinkedHashMap保持插入排序。效率是最优的
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            length += nums.get(i).size();
            for (int j = 0; j < nums.get(i).size(); j++) {
                List<Integer> orDefault = map.getOrDefault(i + j, new ArrayList<>());
                orDefault.add(nums.get(i).get(j));
                map.putIfAbsent(i + j, orDefault);
            }
        }
        int[] result = new int[length];
        int index = 0;
        // 遍历map，得到结果。
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            for (int j = list.size() - 1; j >= 0; j--) {
                result[index] = list.get(j);
                index++;
            }
        }
        return result;
    }
}