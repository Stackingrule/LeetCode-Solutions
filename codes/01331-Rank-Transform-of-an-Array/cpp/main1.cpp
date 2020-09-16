class CustomComparator
{
public:
    bool operator()(const pair<int, int> &first, const pair<int, int> &second)
    {
        return first.first < second.first;
    }
};

class Solution
{
public:
    vector<int> arrayRankTransform(vector<int> &arr)
    {
        int size = arr.size();

        // We will build a new vector, each element is a pair
        // pair.first is the val, pair.second is the index
        vector<pair<int, int>> transformed(size);

        for (int i = 0; i < size; ++i)
        {
            transformed[i] = {arr[i], i};
        }

        // Now sort the new vector based on custom comparing logic
        // We sort from smallest to largest
        sort(transformed.begin(), transformed.end(), CustomComparator());

        int current = 1;
        vector<int> result(size, 1);
        for (int i = 1; i < size; ++i)
        {
            if (transformed[i].first == transformed[i - 1].first)
            {
                result[transformed[i].second] = current;
            }
            else
            {
                result[transformed[i].second] = ++current;
            }
        }

        return result;
    }
};