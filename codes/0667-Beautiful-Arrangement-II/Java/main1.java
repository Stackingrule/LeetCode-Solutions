class Solution {
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int l = 1, r = n;
        int i = 0;
        for (; i < k; i++){
            if (i % 2 == 0) ans[i] = l++;
            else ans[i] = r--;
        }

        if(i % 2 == 1){
            for (int j = l; j <= r; j++) ans[i++] = j;
        }else{
            for (int j = r; j >= l; j--) ans[i++] = j;
        }

        return ans;
    }
}