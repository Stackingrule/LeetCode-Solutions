class Solution
{
public:
    void duplicateZeros(vector<int> &arr)
    {
        int cnt = 0;
        for (int a : arr)
        {
            if (a == 0)
                ++cnt;
        }

        int offset = cnt;
        for (int i = arr.size() - 1; i >= 0; --i)
        {
            if (i + offset < arr.size())
            {
                arr[i + offset] = arr[i];
            }
            if (arr[i] == 0)
            {
                offset--;
                if (i + offset < arr.size())
                {
                    arr[i + offset] = arr[i];
                }
            }
        }
    }
};