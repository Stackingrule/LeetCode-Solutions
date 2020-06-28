class Solution {
    // 方法1：迭代
    public int add(int a, int b) {
        int sum; // 无进位和
        int carry; // 进位值
        while(b != 0) // 当进位为 0 时跳出
        {
            sum = a ^ b; // 异或操作得无进位和
            carry = (a & b) << 1; // 与操作后,左移一位得进位值
            // 循环，直到进位为0
            a = sum;
            b = carry;
        }
        return a;
    }
}