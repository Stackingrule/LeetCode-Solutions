class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        // 不暴躁总数
        int satisfied = 0;
        
        // 暴躁最大总数
        int maxMakeSatisfied = 0;
        
        // winOfMakeSatisfied 为 x 分钟内的暴躁总数
        for (int i = 0, winOfMakeSatisfied = 0; i < grumpy.length; ++i) {
            if (grumpy[i] == 0) { satisfied += customers[i]; }
            else { winOfMakeSatisfied += customers[i]; }
            if (i >= X) {
                // 减去差量，更新暴躁时的总量
                winOfMakeSatisfied -= grumpy[i - X] * customers[i - X];
            }
            maxMakeSatisfied = Math.max(winOfMakeSatisfied, maxMakeSatisfied);
        }
        return satisfied + maxMakeSatisfied;        
    }
}