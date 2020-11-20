class Solution
{
public:
    // idx是从最高位开始计数
    void fix(int &num, int idx)
    {
        int mask = 1 << (31 - idx);
        num |= mask;
    }
    vector<int> drawLine(int length, int w, int x1, int x2, int y)
    {
        vector<int> res(length, 0);

        int h = length / (w / 32);
        int ww = w / 32;

        int idxBase = y * ww;

        for (int i = x1; i <= x2; i++)
        {
            int idx = idxBase + i / 32; // 第多少个整数
            int bitIdx = i % 32;        // 从左往右数，第多少位

            fix(res[idx], bitIdx);
        }
        return res;
    }
};