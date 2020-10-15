
class Solution
{
public:
    string decToBinary(int n)
    {
        string res = "";
        while (n > 0)
        {
            res = to_string(n % 2) + res;
            n = n / 2;
        }
        return res;
    }
    bool queryString(string S, int N)
    {
        for (int i = 1; i <= N; i++)
        {
            string temp = decToBinary(i);
            if (S.find(temp) == string::npos)
                return false;
        }
        return true;
    }
};