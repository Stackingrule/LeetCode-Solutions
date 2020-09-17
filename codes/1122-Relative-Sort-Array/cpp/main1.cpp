class Solution
{
public:
    vector<int> relativeSortArray(vector<int> &arr1, vector<int> &arr2)
    {
        vector<int> count(10001, 0);
        for (int num : arr1)
        {
            count[num]++;
        }
        int index = 0;
        for (int num : arr2)
        {
            while (count[num] > 0)
            {
                arr1[index++] = num;
                count[num]--;
            }
        }
        for (int i = 0; i < count.size(); ++i)
        {
            while (count[i] > 0)
            {
                arr1[index++] = i;
                count[i]--;
            }
        }
        return arr1;
    }
};