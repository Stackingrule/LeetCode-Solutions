class Solution {
    public List<List<Integer>> pairSums(int[] nums, int target) {
        //key:数组的元素;value:该元素出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        
        List<List<Integer>> ans = new ArrayList<>();
        for (int num : nums) {
            Integer count = map.get(target - num);
            if (count != null) {
                ans.add(Arrays.asList(num, target - num));
                if (count == 1)
                    map.remove(target - num);
                else
                    map.put(target - num, --count);
            } else 
                map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return ans;
    }
}