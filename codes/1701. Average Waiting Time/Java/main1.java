class Solution {
    public double averageWaitingTime(int[][] customers) {
        long time = 0;
        long wait = 0;
        int n = customers.length;
        for (int i = 0; i < n; i++) {
            time = Math.max(customers[i][0], time);
            time += customers[i][1];
            wait += time - customers[i][0];
        }
        return (double) wait / n;
    }
}