class Solution {
public:
    int add(int a, int b)
    {
        while(b)
        {
            int ret = a^b;
            b = (unsigned)(a&b) << 1;
            a = ret;
        }
        return a;
    }
};
