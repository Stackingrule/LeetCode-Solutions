class Solution {
public:
    vector<int> constructArr(vector<int>& A) {
        vector<int>left(A.size(),1);
        vector<int>right(A.size(),1);
        for(int i = 1;i<A.size();i++){
            left[i] = A[i-1]*left[i-1];
        }
        for(int i = A.size()-2;i>=0;i--){
            right[i] = A[i+1]*right[i+1];
        }
        vector<int>B(A.size(),0);
        for(int i = 0;i<A.size();i++){
            B[i] = left[i]*right[i];
        }
        return B;
    }
};