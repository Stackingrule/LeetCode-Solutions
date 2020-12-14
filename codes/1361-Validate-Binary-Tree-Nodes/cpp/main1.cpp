class Solution
{
public:
    int dfs(int x, const vector<int> &leftChild, const vector<int> &rightChild)
    {
        if (x == -1)
            return 0;

        return dfs(leftChild[x], leftChild, rightChild) + dfs(rightChild[x], leftChild, rightChild) + 1;
    }

    bool validateBinaryTreeNodes(int n,
                                 vector<int> &leftChild, vector<int> &rightChild)
    {

        vector<int> indegree(n, 0);
        int m = 0;

        for (int i = 0; i < n; i++)
        {
            if (leftChild[i] > -1)
            {
                m++;
                indegree[leftChild[i]]++;
            }

            if (rightChild[i] > -1)
            {
                m++;
                indegree[rightChild[i]]++;
            }
        }

        if (m != n - 1)
            return false;

        int rt = -1;
        for (int i = 0; i < n; i++)
        {
            if (indegree[i] == 0)
                rt = i;
            else if (indegree[i] > 1)
                return false;
        }

        return dfs(rt, leftChild, rightChild) == n;
    }
};