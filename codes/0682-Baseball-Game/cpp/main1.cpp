class Solution
{
public:
    int calPoints(vector<string> &ops)
    {
        vector<int> res;
        for (string s : ops)
        {
            int n = res.size();
            if (s == "+")
            {
                res.push_back(res[n - 1] + res[n - 2]);
            }
            else if (s == "D")
            {
                res.push_back(2 * res[n - 1]);
            }
            else if (s == "C")
            {
                res.pop_back();
            }
            else
            {
                res.push_back(atoi(s.c_str()));
            }
        }
        int sum = 0;
        for (int i : res)
        {
            sum += i;
        }
        return sum;
    }
};
