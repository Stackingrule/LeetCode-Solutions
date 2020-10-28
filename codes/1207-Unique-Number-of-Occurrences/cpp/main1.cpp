class Solution
{
public:
    bool uniqueOccurrences(vector<int> &arr)
    {
        unordered_map<int, int> count;
        for (auto item : arr)
            ++count[item];
        unordered_set<int> s;
        for (auto p : count)
            s.insert(p.second);
        return count.size() == s.size();
    }
};