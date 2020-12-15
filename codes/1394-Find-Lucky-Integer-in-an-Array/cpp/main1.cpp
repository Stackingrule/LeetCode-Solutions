class Solution
{
public:
    int findLucky(vector<int> &arr)
    {
        sort(arr.rbegin(), arr.rend());
        unordered_map<int, int> m;
        for (int a : arr)
        {
            m[a]++;
        }

        for (int a : arr)
        {
            if (m[a] == a)
                return a;
        }

        return -1;
    }
};