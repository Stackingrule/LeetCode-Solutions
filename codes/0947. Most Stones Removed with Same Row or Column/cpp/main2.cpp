class Solution
{
public:
    int removeStones(vector<vector<int>> &stones)
    {
        unordered_map<int, vector<int>> rowMap, colMap;
        unordered_set<int> rowVisited;
        int res = 0;
        for (auto stone : stones)
        {
            rowMap[stone[0]].push_back(stone[1]);
            colMap[stone[1]].push_back(stone[0]);
        }
        for (auto a : rowMap)
        {
            res += max(0, helper(rowMap, colMap, a.first, rowVisited) - 1);
        }
        return res;
    }
    int helper(unordered_map<int, vector<int>> &rowMap, unordered_map<int, vector<int>> &colMap, int row, unordered_set<int> &rowVisited)
    {
        if (rowVisited.count(row))
            return 0;
        rowVisited.insert(row);
        int res = rowMap[row].size();
        for (int c : rowMap[row])
        {
            for (int r : colMap[c])
            {
                res += helper(rowMap, colMap, r, rowVisited);
            }
        }
        return res;
    }
};