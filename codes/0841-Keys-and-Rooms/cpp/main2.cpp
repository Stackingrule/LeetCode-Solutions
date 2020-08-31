class Solution
{
public:
    bool canVisitAllRooms(vector<vector<int>> &rooms)
    {
        unordered_set<int> visited;
        helper(rooms, 0, visited);
        return visited.size() == rooms.size();
    }
    void helper(vector<vector<int>> &rooms, int cur, unordered_set<int> &visited)
    {
        visited.insert(cur);
        for (int key : rooms[cur])
        {
            if (!visited.count(key))
                helper(rooms, key, visited);
        }
    }
};