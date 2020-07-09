class Solution {
public:
    bool oneEditAway(string first, string second) {
    	int n1 = first.size(), n2 = second.size();
    	if (abs(n1 - n2) > 1) return false;
    	int count = 0;	//记录变换位置数
    	int i = 0, j = 0;
    	//遍历string，统计变化位数
    	while (i < n1 && j < n2) {
    		if (first[i] == second[j]) {	//相同后移
    			++i;
    			++j;
    		}
    		else {
    			++count;
    			if (count > 1) {
    				return false;
    			}
    			//1. first序列长，则为删除操作，跳过first当前项
    			if (n1 > n2) {
    				++i;
    			}
    			//2. 一样长，则为替换操作，同时跳过
    			if (n1 == n2) {
    				++i;
    				++j;
    			}
    			//3. second序列长，则为插入操作，跳过second当前项
    			if (n1 < n2) {
    				++j;
    			}
    		}
    	}
    	return true;
    }
};