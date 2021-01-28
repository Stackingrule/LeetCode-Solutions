class Solution {
    public String getSmallestString(int n, int k) {
        char[] ans = new char[n];
        for(int i=0;i<n;i++)
        {
            ans[i] = 'a';
            k--;
        }
        n=n-1;
        while(k>0)
        {
            if(k>25) {
                ans[n]='z';
                k-=25;
            }
            else
            {
                ans[n]+=k;
                break;
            }
            n--;
        }
        return String.valueOf(ans);
    }
}