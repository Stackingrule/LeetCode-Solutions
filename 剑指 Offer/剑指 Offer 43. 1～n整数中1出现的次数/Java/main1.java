class Solution {
    public int countDigitOne(int n) {
        if (n < 1) {
            return 0;
        }

        // 高位
        int temp = n;
        // 低位
        int low = 0;
        // 1出现的总次数
        int total = 0;
        // 当前位数，比如个位时为1，十位时为10，百位时为100
        int pow = 1;
        while (temp != 0) {
            // 当前位上的数字
            int num = temp % 10;
            // 剩下的高位
            temp = temp / 10;
            // 如果当前位上的数字是0
            if (num == 0) {
                // 只加上高位对应
                total += temp * pow;
            }
            // 如果当前位上的数字是1
            else if (num == 1) {
                // 加上高位对应的数字，和低位的所有，再加1(它本身)。
                // 比如10，虽然低位是0，但本身还有1
                total += temp * pow + low + 1;
            }
            // 如果当前位上的数字大于1
            else {
                // 那么高位+1
                total += (temp + 1) * pow;
            }

            // 低位
            low += num * pow;
            // 进入下一位
            pow = pow * 10;
        }

        return total;
    }
}