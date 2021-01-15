class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int len1 = n/20;
        double sum = 0;
        double count = (n - 2 * len1);
        for(int i = len1;i < n - len1;i++){
            sum += arr[i];
        }

        return sum/count;
        
    }
}