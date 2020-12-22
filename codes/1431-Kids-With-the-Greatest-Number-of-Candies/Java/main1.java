class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int mc = candies[0];

        // 找到 kids 目前手中的最大 candies
        for (int i = 0; i < candies.length; ++i) {
            if(candies[i] > mc) mc=candies[i];
        }
        // kids 手中已知 greatest candies 保存在 mc 中
        for (int i = 0; i < candies.length; ++i) {
            if(candies[i]+extraCandies >= mc) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }
}