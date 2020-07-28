class Solution
{
public:
    vector<string> getValidT9Words(string num, vector<string> &words)
    {
        vector<string> res;
        vector<char> map = {'2',
                            '2',
                            '2',
                            '3',
                            '3',
                            '3',
                            '4',
                            '4',
                            '4',
                            '5',
                            '5',
                            '5',
                            '6',
                            '6',
                            '6',
                            '7',
                            '7',
                            '7',
                            '7',
                            '8',
                            '8',
                            '8',
                            '9',
                            '9',
                            '9',
                            '9'};

        for (auto word : words)
        {
            string str;
            for (char ch : word)
            {
                str.push_back(map[ch - 'a']);
            }
            if (str == num)
            {
                res.push_back(word);
            }
        }

        return res;
    }
};