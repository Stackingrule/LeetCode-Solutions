class Solution
{
public:
    int maximumSwap(int num)
    {
        string str = to_string(num);
        int n = str.size(), mx = n - 1, pos1 = -1, pos2 = -1;
        for (int i = n - 2; i >= 0; --i)
        {
            if (str[i] < str[mx])
            {
                pos1 = i;
                pos2 = mx;
            }
            else if (str[i] > str[mx])
            {
                mx = i;
            }
        }
        if (pos1 != -1)
            swap(str[pos1], str[pos2]);
        return stoi(str);
    }
};