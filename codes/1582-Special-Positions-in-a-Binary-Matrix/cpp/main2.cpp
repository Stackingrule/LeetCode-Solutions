class Solution
{
public:
    unordered_map<int, int> row, col;
    int numSpecial(vector<vector<int>> &mat)
    {

        if (mat.size() == 0 || mat[0].size() == 0)
        {
            return 0;
        }
        for (int i = 0; i < mat.size(); i++)
        {
            for (int j = 0; j < mat[0].size(); j++)
            {
                if (mat[i][j] == 1)
                {
                    row[i]++;
                    col[j]++;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < mat.size(); i++)
        {
            for (int j = 0; j < mat[0].size(); j++)
            {
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1)
                {
                    res++;
                }
            }
        }

        return res;
    }
};