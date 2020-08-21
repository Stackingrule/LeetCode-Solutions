class Solution
{
public:
    vector<int> sortArrayByParityII(vector<int> &A)
    {
        vector<int> res, even, odd;
        for (int num : A)
        {
            if (num % 2 == 0)
                even.push_back(num);
            else
                odd.push_back(num);
        }
        for (int i = 0; i < even.size(); ++i)
        {
            res.push_back(even[i]);
            res.push_back(odd[i]);
        }
        return res;
    }
};