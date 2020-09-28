class Solution
{
public:
    bool judgeCircle(string moves)
    {
        int w = 0, h = 0;
        for (int i = 0; i < moves.length(); i++)
            if (moves[i] == 'L')
                w++;
            else if (moves[i] == 'R')
                w--;
            else if (moves[i] == 'U')
                h++;
            else
                h--;
        return w == 0 && h == 0;
    }
};