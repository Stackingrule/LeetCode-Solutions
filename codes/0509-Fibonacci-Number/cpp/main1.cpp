class Solution {
public:
    int fib(int N) {
        if (N <= 1) return N;
        return fib(N - 2) + fib(N - 1);
    }
};