class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int len = A.length;
        int[] odd = new int[len/2];
        int[] even = new int[len/2];
        int k = 0;
        int j = 0;
        int[] ans = new int[len];
        for(int i=0;i<len;i++){
            if(A[i]%2 == 0){
                even[j++] = A[i];
            }
            else{
                odd[k++] = A[i];
            }
        }
        
        for(int i= 0; i<len/2; i++){
            ans[2*i] = even[i];
            ans[2*i+1] = odd[i];
        }
        return ans;
    }
}