class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b) ->{
            if(a[0]>b[0])
                return 1;
            else if(a[0]<b[0])
                return -1;
            else{
                return (b[1]-a[1]);
            }
        });     
        int n = intervals.length;
        int result = n;
        int r = -1;
        for (int i = 0; i < n; ++i) {
            if (intervals[i][1] <= r) {
                result--;
            }
            else {
                r = intervals[i][1];
            }
        }
        
        return result;
    }
}