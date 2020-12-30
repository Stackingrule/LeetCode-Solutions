class Solution
{
public:
    //遍历每个字符，然后循环检查这个字符开始连续最大重复子串， 计算连续最大子串思路同459
    int maxRepeating(string sequence, string word)
    {
        int sequenceSize = sequence.size();
        int wordSize = word.size();
        int count = 0;
        int maxCount = 0;
        int i = 0;
        for (int i = 0; i < sequenceSize; i++)
        {
            count = 0;
            int j = i;
            //循环计算最大连续重复i子串
            while (sequence.substr(j, wordSize) == word)
            {
                count++;
                maxCount = max(maxCount, count);
                j += wordSize;
            }
        }
        return maxCount;
    }
};