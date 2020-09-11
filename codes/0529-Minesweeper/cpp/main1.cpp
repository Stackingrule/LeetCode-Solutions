class Solution
{
public:
    vector<vector<int>> DIRECTIONS = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    vector<vector<char>> updateBoard(vector<vector<char>> &board, vector<int> &click)
    {
        int x = click[0];
        int y = click[1];
        if (board[x][y] == 'M')
        {
            board[x][y] = 'X';
            return board;
        }

        queue<vector<int>> q;
        q.push({x, y});
        board[x][y] = '*';

        while (!q.empty())
        {
            vector<int> pos = q.front(); q.pop();
            int i = pos[0];
            int j = pos[1];
            int minCount = getAdjacentMines(board, i, j);

            if (minCount > 0)
            {
                board[i][j] = (char)('0' + minCount);
                continue;
            }

            board[i][j] = 'B';

            for (vector<int> dir : DIRECTIONS)
            {
                i = pos[0] + dir[0];
                j = pos[1] + dir[1];
                if (!isValid(board, i, j) || board[i][j] != 'E')
                {
                    continue;
                }
                q.push({i, j});
                board[i][j] = '*';
            }
        }
        return board;
    }

    int getAdjacentMines(vector<vector<char>> &board, int i, int j)
    {
        int cnt = 0;
        for (vector<int> dir : DIRECTIONS)
        {
            int x = i + dir[0];
            int y = j + dir[1];
            if (isValid(board, x, y) && board[x][y] == 'M') {
                ++cnt;
            }
        }
        return cnt;
    }

    bool isValid(vector<vector<char>> &board, int i, int j)
    {
        return (i >= 0 && i < board.size() && j >= 0 && j < board[0].size());
    }
};