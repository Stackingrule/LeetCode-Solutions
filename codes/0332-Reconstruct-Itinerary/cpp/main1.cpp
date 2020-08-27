class Solution
{
public:
    vector<string> findItinerary(vector<vector<string>> &tickets)
    {
        for (int i = 0; i < tickets.size(); ++i)
        {
            if (map.find(tickets[i][0]) == map.end())
            {
                priority_queue<string, vector<string>, cmp> q;
                q.push(tickets[i][1]);
                map[tickets[i][0]] = q;
            }
            else
            {
                map[tickets[i][0]].push(tickets[i][1]);
            }
        }
        findPath("JFK");
        reverse(res.begin(), res.end());
        return res;
    }
    void findPath(string begin)
    {
        while (map.find(begin) != map.end() && map[begin].size() != 0)
        {
            string next = map[begin].top();
            map[begin].pop();
            findPath(next);
        }
        res.push_back(begin);
    }

private:
    struct cmp
    {
        bool operator()(string a, string b)
        {
            return a > b;
        }
    };
    vector<string> res;
    unordered_map<string, priority_queue<string, vector<string>, cmp>> map;
};
