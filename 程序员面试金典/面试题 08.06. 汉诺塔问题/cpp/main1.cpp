class Solution {
public:
    void hanota(vector<int>& A, vector<int>& B, vector<int>& C) {
        int n = A.size();
        move(n, A, B, C);
    }
    //n表示当前还剩下的盘子。
    void move(int n, vector<int>& A, vector<int>& B, vector<int>& C){
        //只剩下1个盘子，直接从A到C，退出递归
        if (n == 1){
            C.push_back(A.back());
            A.pop_back();//A中最后一个装入C
            return;
        }
        // 实现A到C，分两步move：A到B，B到C。
        move(n-1, A, C, B);//A通过C到B，所以参数顺序是ACB
        C.push_back(A.back());
        A.pop_back();//A中最后一个装入C
        move(n-1, B, A, C);//B通过A到C，所以参数顺序是BAC
    }
};
