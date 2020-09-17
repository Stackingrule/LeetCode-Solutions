class Solution
{
public:
    bool isRobotBounded(string instructions)
    {
        vector<vector<int>> move = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        int x = 0, y = 0, direction = 0;
        for (auto instruction : instructions)
        {
            if (instruction == 'G')
            {
                x += move[direction][0];
                y += move[direction][1];
            }
            else if (instruction == 'L')
            {
                direction = (direction + 1) % 4;
            }
            else
            {
                direction = (direction + 3) % 4;
            }        
        }

        return (x == 0 && y == 0) | (direction != 0);
    }
};