/*
* 思路：题意是n=1时输出字符串1；n=2时，数上次字符串中的数值个数，因为上次字符串有1个1，
* 所以输出11；n=3时，由于上次字符是11，有2个1，所以输出21；n=4时，由于上次字符串是21，有1个2和1个1，
* 所以输出1211。依次类推，写个countAndSay(n)函数返回字符串。
*/
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        //递归调用，然后对字符串处理
        String str = countAndSay(n - 1) + "*"; //为了str末尾的标记，方便循环读数
        char[] c = str.toCharArray();
        int count = 1;
        String s = "";
        for (int i = 0; i < c.length; ++i) {
        	if (c[i] == c[i + 1]) {
        		count++; //计数增加
        	}
        	else {
        		s = s + count + c[i]; //上面的*标记这里方便统一处理
        		count = 1; //初始化
        	}
        }
        return s;
    }
}