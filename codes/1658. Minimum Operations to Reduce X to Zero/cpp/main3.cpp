class Solution
{
public:
    int minOperations(vector<int> &v, int x)
    {
        stack<int> stk;
        int ans = 1e6;
        for (int i = v.size() - 1; i >= 0; i--)
        {
            if (v[i] <= x)
            {
                x -= v[i];
                stk.push(i);
            }
            else
                break;
        }
        if (x == 0)
            ans = min(ans, (int)v.size() - stk.top());
        for (int i = 0; i < v.size(); i++)
        {
            if (!stk.empty() && stk.top() == i)
            {
                x += v[stk.top()];
                stk.pop();
            }
            x -= v[i];
            while (x < 0 && !stk.empty())
            {
                x += v[stk.top()];
                stk.pop();
            }
            if (x < 0 && stk.empty())
                break;
            if (x == 0)
            {
                if (stk.empty())
                {
                    ans = min(ans, i + 1);
                    break;
                }
                else
                    ans = min(ans, i + 1 + (int)(v.size() - stk.top()));
            }
        }
        if (ans == 1e6)
            return -1;
        return ans;
    }
};