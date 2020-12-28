class Solution {
public:
    int largestSumAfterKNegations(vector<int>& A, int K) {
        int sum = 0, index;
        sort(A.begin(), A.end());
        
        for(int index = 0;K && (A[index] < 0) && index < A.size();index++){
            A[index] = -A[index];
            K--;
        }
        
        K %= 2; index = sum = 0;
        if(K > 0){
            sort(A.begin(), A.end());
            sum += -A[index++];
        }
        
        for(;index < A.size();index++)
            sum += A[index];
        
        return sum;
    }
};