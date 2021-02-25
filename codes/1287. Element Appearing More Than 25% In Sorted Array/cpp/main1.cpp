class Solution {
public:
  int findSpecialInteger(vector<int>& arr) {
    int s = arr.size() / 4;
    for (int i = 0; i + s < arr.size(); ++i)
      if (arr[i] == arr[i + s]) return arr[i];
    return -1;
  }
};