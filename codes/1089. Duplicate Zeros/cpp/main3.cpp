class Solution
{
public:
    void duplicateZeros(vector<int> &arr)
    {
        if (arr.size() < 1)
            return;
        vector<int> back;
        for (int i = 0; i < arr.size(); i++)
        {
            back.push_back(arr[i]);
            if (arr[i] == 0)
                back.push_back(0);
        }
        arr.assign(back.begin(), back.begin() + arr.size());
        return;
    }
};