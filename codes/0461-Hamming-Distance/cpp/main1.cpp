/*
* 按位分别取出两个数对应位上的数并异或，
* 我们知道异或的性质上相同的为0，不同的为1，我们只要把为1的情况累加起来就是汉明距离了
*/
class Solution {
public:
    int hammingDistance(int x, int y) {
        int res = 0;
        for (int i = 0; i < 32; ++i) {
        	if ((x & (1 << i)) ^ (y & (1 << i))) {
        		++res;
        	}
        }
        return res;
    }
};