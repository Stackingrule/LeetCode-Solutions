#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {

    	digits[digits.size() - 1] ++;

    	for(int i = digits.size() - 1; i >= 1; i--) {
    		if(digits[i] == 10) {
    			digits[i] = 0;
    			digits[i - 1] ++;
    		}
    	}
    	if(digits[0] == 10) {
    		digits[0] = 0;
    		digits.insert(digits.begin(), 1);
    	}

    	return digits;
        
    }
};

inline void printVector(vector<int> &v) {
	for(int i = 0; i < v.size(); i++) {
		cout << v[i] ;
	}
	cout << endl;
}

int main() {
	vector<int> v;
	v = {1, 2, 3, 4, 5, 6};

	Solution solve;

	cout << "原来的数 ：";
	printVector(v);
    
    vector<int> nv = solve.plusOne(v);
	cout << "加1后的数：";
	printVector(nv);

	return 0;

}