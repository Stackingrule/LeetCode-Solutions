class Solution
{
public:
    vector<vector<int>> diagonalSort(vector<vector<int>> &mat)
    {
        int m = mat.size();
        int n = mat[0].size();

        if (m > n)
        {
            for (int k = m - 2; k > m - n; k--)
            {
                for (int i = k; i < m - 1; i++)
                    for (int j = i + 1; j < m; j++)
                    {
                        if (mat[i][i - k] > mat[j][j - k])
                            swap(mat[i][i - k], mat[j][j - k]);
                    }
            }
            for (int k = n - 2; k > 0; k--)
            {
                for (int i = k; i < n - 1; i++)
                    for (int j = i + 1; j < n; j++)
                    {
                        if (mat[i - k][i] > mat[j - k][j])
                            swap(mat[i - k][i], mat[j - k][j]);
                    }
            }

            for (int k = 0; k <= m - n; k++)
            {
                for (int i = 0; i < n - 1; i++)
                    for (int j = i + 1; j < n; j++)
                        if (mat[i + k][i] > mat[j + k][j])
                            swap(mat[i + k][i], mat[j + k][j]);
            }
        }
        else
        {
            for (int k = m - 2; k > 0; k--)
            {
                for (int i = k; i < m - 1; i++)
                    for (int j = i + 1; j < m; j++)
                    {
                        if (mat[i][i - k] > mat[j][j - k])
                            swap(mat[i][i - k], mat[j][j - k]);
                    }
            }
            for (int k = n - m + 1; k < n - 1; k++)
            {
                for (int i = k; i < n - 1; i++)
                    for (int j = i + 1; j < n; j++)
                    {
                        if (mat[i - k][i] > mat[j - k][j])
                            swap(mat[i - k][i], mat[j - k][j]);
                    }
            }
            for (int k = 0; k <= n - m; k++)
            {
                for (int i = 0; i < m - 1; i++)
                    for (int j = i + 1; j < m; j++)
                        if (mat[i][i + k] > mat[j][j + k])
                            swap(mat[i][i + k], mat[j][j + k]);
            }
        }
        return mat;
    }
};