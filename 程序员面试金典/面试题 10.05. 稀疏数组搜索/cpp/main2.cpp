class Solution {
public:
    //bf
    /*
    int findString(vector<string>& words, string s) {
        for (int i = 0; i < words.size(); ++i) {
            if (words[i] == s) return i;
        }
        return -1;
    }
    */

    int findString(vector<string>& words, string s) {
        int l = 0;
        int r = words.size() - 1;
        while (l <= r) {
            int mid = l + (r - l >> 1);
            int index = mid;
            while (index >= 0 && words[index] == "") --index;
            if (index >= 0) {
                if (words[index] == s) return index;
                else if (words[index] < s) l = mid + 1;
                else r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return l < words.size() && words[l] == s ? l : -1;
    }
};
