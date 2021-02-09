class Solution {
    public int[] frequencySort(int[] nums) {
        Integer[] array = new Integer[nums.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Integer) nums[i];
        }

        // 计算每个元素出现的频率
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        // 进行排序
        Arrays.sort(array, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.get(o1).equals(map.get(o2))) {
                    return o2 - o1;
                }
                return (int) map.get(o1) - map.get(o2);
            }
        });
        for (int i = 0; i < array.length; i++) {
            nums[i] = (int) array[i];
        }
        return nums;
    }
}