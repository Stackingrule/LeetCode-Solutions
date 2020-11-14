class Solution
{
public:
    vector<int> findClosedNumbers(int num)
    {
        vector<int> a = decode(num);
        vector<int> b = decode(num);
        vector<int> ans(2, -1);
        if (next_permutation(begin(a), end(a)))
        {
            ans[0] = code(a);
        }
        if (prev_permutation(begin(b), end(b)))
        {
            ans[1] = code(b);
        }
        return ans;
    }

private:
    static constexpr int len = 8 * sizeof(int);

    vector<int> decode(int num)
    {
        vector<int> ans(len, 0);
        for (int i = len - 1; 0 <= i; --i)
        {
            ans[i] = num % 2;
            num /= 2;
        }
        return ans;
    }

    int code(vector<int> v)
    {
        int ans = 0;
        for (int i = 0; i < len; ++i)
        {
            ans *= 2;
            ans += v[i];
        }
        return ans;
    }
};