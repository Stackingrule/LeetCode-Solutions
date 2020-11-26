class Solution
{
private:
    vector<int> ans;
    void flip(int k, vector<int> &A)
    {
        for (int i = 0; i < k - i - 1; i++)
            swap(A[i], A[k - i - 1]);
        ans.push_back(k);
    }

public:
    vector<int> pancakeSort(vector<int> &A)
    {
        int n = A.size();
        for (int i = n; i >= 1; i--)
        {
            // put i on place i
            int index = 0;
            while (A[index] != i && index < n)
                index++;
            if (index == i - 1)
                continue;
            flip(index + 1, A);
            flip(i, A);
        }
        return ans;
    }
};