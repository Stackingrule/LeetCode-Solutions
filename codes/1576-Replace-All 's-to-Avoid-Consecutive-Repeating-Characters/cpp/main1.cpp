class Solution
{
public:
    string modifyString(string s)
    {
        for (int i = 0; i < s.size(); ++i)
        {
            if (s[i] == '?')
            {
                //前面一个字符  如果当前是第0个的话 字符就为‘ ’
                char ahead = i == 0 ? ' ' : s[i - 1];
                //后面一个字符  如果当前是最后一个的话 字符就为‘ ’
                char behind = i == s.size() - 1 ? ' ' : s[i + 1];
                //从a开始比较  如果等于前面或者后面的话 就+1
                char temp = 'a';
                while (temp == ahead || temp == behind)
                {
                    temp++;
                }
                //找到目标字符后 做替换
                s[i] = temp;
            }
        }
        return s;
    }
};