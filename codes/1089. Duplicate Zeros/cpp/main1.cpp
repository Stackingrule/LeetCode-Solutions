class Solution
{
public:
    void duplicateZeros(vector<int> &arr)
    {
        if (arr.size() == 1)
            return;
        stack<int> num;
        for (auto a : arr)
        {
            num.push(a);
            if (!a)
                num.push(a);

            if (num.size() >= arr.size())
                break;
        }
        if (num.size() > arr.size())
            num.pop();
        int start = num.size() - 1;
        //   cout<<start<<endl;
        while (!num.empty())
        {
            arr[start--] = num.top();
            num.pop();
        }
    }
};