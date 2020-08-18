/**
 * BFS
 * */
class Solution
{
public:
    vector<int> numsSameConsecDiff(int N, int K)
    {
        deque<int> q{1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (N == 1)
            q.push_front(0);
        while (--N)
        {
            int size = q.size();
            while (size--)
            {
                int num = q.front();
                q.pop_front();
                int r = num % 10;
                if (r + K <= 9)
                    q.push_back(num * 10 + r + K);
                if (r - K >= 0 && K != 0)
                    q.push_back(num * 10 + r - K);
            }
        }
        return vector<int>(cbegin(q), cend(q));
    }
};