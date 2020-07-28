class Solution
{
public:
    bool searchMatrix(vector<vector<int>> &matrix, int target)
    {
        int m = matrix.size();
        if (!m) return false;
        int n = matrix[0].size();
        int now = n - 1, row = 0;
        while (now >= 0 && row < m)
        {
            int l = 0, r = now;
            while (l <= r)
            {
                int mid = (l + r) / 2;
                if (matrix[row][mid] == target) return true;
                else if (matrix[row][mid] < target) l = mid + 1;
                else r = mid - 1;
            }
            now = r;
            row++;
        }
        return false;
    }
};