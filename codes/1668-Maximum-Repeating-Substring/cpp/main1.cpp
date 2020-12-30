class Solution
{
public:
    int maxRepeating(string sequence, string word)
    {
        int count = 0;
        string s(word);
        while (sequence.find(s) <= sequence.size() - 1)
        {
            s += word;
            count++;
        }
        return count;
    }
};