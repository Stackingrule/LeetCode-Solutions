class Solution {
    public int hIndex(int[] citations) {
       int n = citations.length;
       if (n <= 0) return 0;
       Arrays.sort(citations);
       int count = 0;
       for (int i = n - 1; i >= 0; --i) {
       		if (count >= citations[i])
       			return Math.max(count, citations[i]);
       		count++;
       }
       return count;
    }
}