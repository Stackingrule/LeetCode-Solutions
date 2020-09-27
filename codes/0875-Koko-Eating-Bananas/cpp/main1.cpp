class Solution
{
public:
    int needTime(vector<int> piles, int K)
    { //计算速度为K时吃完所有香蕉所需要的时间。
        int T = 0;
        for (int i = 0; i < piles.size(); i++)
        {
            T += ceil(float(piles[i]) / K); //上取整
        }
        return T;
    }
    int minEatingSpeed(vector<int> &piles, int H)
    {
        int max = 0;
        for (int i = 0; i < piles.size(); i++)
        { //计算max{piles[i]}
            if (piles[i] > max)
                max = piles[i];
        }
        if (H == piles.size())
            return max;
        int l = 1; //K的查找范围为[1, max]
        int r = max;
        while (l < r)
        {
            int mid = (l + r) / 2;
            int T = needTime(piles, mid);
            if (T > H)
                l = mid + 1;
            if (T <= H) //查找lower bound
                r = mid;
        }
        return r;
    }
};