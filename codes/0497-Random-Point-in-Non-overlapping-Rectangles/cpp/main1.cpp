class Solution
{
public:
    Solution(vector<vector<int>> rects)
    {
        _rects = rects;
    }

    vector<int> pick()
    {
        int sumArea = 0;
        vector<int> selected;
        for (auto rect : _rects)
        {
            int area = (rect[2] - rect[0] + 1) * (rect[3] - rect[1] + 1);
            sumArea += area;
            if (rand() % sumArea < area)
                selected = rect;
        }
        int x = rand() % (selected[2] - selected[0] + 1) + selected[0];
        int y = rand() % (selected[3] - selected[1] + 1) + selected[1];
        return {x, y};
    }

private:
    vector<vector<int>> _rects;
};