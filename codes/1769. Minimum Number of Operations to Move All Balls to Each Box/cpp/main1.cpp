class Solution
{
public:
    vector<int> minOperations(string boxes)
    {
        int n = boxes.size();
        vector<int> box(n, 0);
        set<int> st;
        for (int i = 0; i < n; i++)
        {
            if (boxes[i] == '1')
            {
                st.insert(i);
            }
        }
        vector<int> res(n, 0);
        for (int i = 0; i < n; i++)
        {
            for (auto ball : st)
            {
                if (ball != i)
                {
                    res[i] += abs(i - ball);
                }
            }
        }
        return res;
    }
};