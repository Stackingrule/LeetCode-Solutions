class Solution
{
public:
    bool isPathCrossing(string path)
    {
        int r = 0, c = 0;
        unordered_set<string> seen;

        seen.insert("0.0");

        for (char ch : path)
        {
            if (ch == 'N')
                r--;
            else if (ch == 'S')
                r++;
            else if (ch == 'E')
                c++;
            else
                c--;

            string str(to_string(r) + "." + to_string(c));
            if (seen.find(str) != seen.end())
                return true;

            seen.insert(str);
        }

        return false;
    }
};
