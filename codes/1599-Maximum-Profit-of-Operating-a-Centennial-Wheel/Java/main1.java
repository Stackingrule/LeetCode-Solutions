class Solution {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int run = 0;
        int maxRun = 1;
        int prof = 0;
        int maxProf = prof;
        int sum = 0;
        int i = 0;
        while (sum > 0 || i < customers.length) {
            if (i < customers.length) {
                sum += customers[i++];
            }
            int boarding = Math.min(4, sum);  // boarding people by greedy.
            sum -= boarding;
            prof = prof + boarding * boardingCost - runningCost;
            run++;
            if (prof > maxProf) {
                maxProf = prof;
                maxRun = run;
            }
        }
        return maxProf > 0 ? maxRun : -1;
    }
}