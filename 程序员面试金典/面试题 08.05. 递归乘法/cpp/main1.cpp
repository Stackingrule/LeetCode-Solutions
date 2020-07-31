class Solution
{
public:
    int multiply(int A, int B)
    {
        int res = 0;
        if (A == 0 || B == 0) return 0; 
        if (A == 1) return B;
        if (B == 1) return A;

        if (A >= B) 
        {
            res = A + multiply(A, B - 1);
        } else
        {
            res = B + multiply(B, A - 1);
        }
        
        return res;
    }
};