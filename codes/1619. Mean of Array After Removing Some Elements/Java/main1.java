public class Solution {
    public double TrimMean(int[] arr) {
        Array.Sort(arr);        
        int len = arr.Length;
        double sum = 0;
        for(int i= len/20 ; i<arr.Length-(len/20);i++){
            sum+=arr[i];
        }
        
        return sum/(len-(len/10));
    }
}