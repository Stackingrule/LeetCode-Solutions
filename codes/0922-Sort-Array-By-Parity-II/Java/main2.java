class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2)  //先搞定偶数部分
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1)          //直到找到一个偶数记下其位置
                    j += 2;
 
                // Swap A[i] and A[j]          // 交换在奇数位置的偶数和在偶数位置的奇数
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
 
        return A;
    }
}