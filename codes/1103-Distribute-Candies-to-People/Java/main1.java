class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int cur = 1;
        while (candies > 0) {
            for (int i = 0; i < num_people; ++i) {
                if (candies >= cur) {
                    res[i] += cur;
                    candies -= cur;
                }
                else {
                    res[i] += candies;
                    candies = 0;
                    break;
                }
                ++cur;
            }
        }
        return res;
    }
}