class Solution
{
public:
    string thousandSeparator(int n)
    {
        string ans;
        int count = 0;
        do
        {
            if (count++ % 3 == 0 && ans.size())
                ans = "." + ans;
            ans = to_string(n % 10) + ans;
            n /= 10;
        } while (n);
        return ans;
    }
};