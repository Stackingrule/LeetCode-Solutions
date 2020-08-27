class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] result = new int[intervals.length];
        int min = intervals[0][0], max = intervals[0][1];
        
        for(int i = 1 ; i<intervals.length ; i++) {
            min = Math.min(min, intervals[i][0]);
            max = Math.max(max, intervals[i][1]);
        }
        
        int[] buckets = new int[max - min + 1];
        Arrays.fill(buckets, -1);
        for(int i = 0 ; i<intervals.length ; i++) {
            buckets[intervals[i][0] - min] = i;
        }
        
        for(int i = buckets.length-2 ; i>=0 ; i--) {
            if(buckets[i] == -1) buckets[i] = buckets[i+1]; 
        }
        
        for(int i = 0 ; i<intervals.length ; i++) {
            result[i] = buckets[intervals[i][1] - min];
        }
        return result;
    }
}