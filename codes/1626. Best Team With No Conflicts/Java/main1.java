class Solution {
    static int N = 1010;
    static Pair[] pair = new Pair[N];
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        for(int i = 0;i < n;i ++)
        {
            pair[i] = new Pair(scores[i], ages[i]);
        }
        Arrays.sort(pair,0, n,  (x, y) -> {return x.a == y.a ? x.s - y.s : x.a - y.a;});
        int[] f = new int[n];
        int res = 0;
        //求scores的最长（不严格）上升的子序列和
        for(int i = 0;i < n;i ++)
        {
            f[i] = pair[i].s;
            for(int j = 0;j < i;j ++)
            {
                if(pair[j].s <= pair[i].s)
                    f[i] = Math.max(f[i], f[j] + pair[i].s);
            }
            res = Math.max(res, f[i]);
        }
        return res;
    }
}
class Pair
{
    int a, s;
    Pair(int s, int a)
    {
        this.s = s;
        this.a = a;
    }
}