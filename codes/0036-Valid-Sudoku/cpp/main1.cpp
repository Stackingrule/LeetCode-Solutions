#include <iostream>
#include <vector>
#include <cassert>
#include <stdexcept>

using namespace std;

class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        
    }
};0








int main() {

    vector<string> input = {.;;;;p;
        "53..7....",
        "6..195...",
        ".98....6.",
        "8...6...3",
        "4..8.3..1",
        "7...2...6",
        ".6....28.",
        "...419..5",
        "....8..79"
    };

    vector<vector<char>> board;
    for(const string& row: input){
        vector<char> r;
        for(char c: row)
            r.push_back(c);
        board.push_back(r);
    }

    cout << Solution().isValidSudoku(board) << endl;

    return 0;
}