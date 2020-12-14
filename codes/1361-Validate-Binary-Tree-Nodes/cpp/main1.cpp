/**
若一个图满足以下三个要求，就是一个有效的二叉树：
1.有且仅有一个结点的入度为0；
2.所有结点的入度最大为1；
3.所有结点的出度最大为2(题目本身就满足)。
 * 
 */
class Solution
{
public:
    bool validateBinaryTreeNodes(int n, vector<int> &leftChild, vector<int> &rightChild)
    {
        vector<int> in(n, 0);

        for (int i = 0; i < n; ++i)
        {
            if (leftChild[i] != -1)
            {
                in[leftChild[i]]++;
            }
            if (rightChild[i] != -1)
            {
                in[rightChild[i]]++;
            }
        }

        int count = 0;
        for (int i = 0; i < n; ++i)
        {
            if (in[i] > 1)
            {
                return false;
            }
            if (in[i] == 0)
            {
                ++count;
            }
        }
        if (count != 1)
        {
            return false;
        }

        return true;
    }
};