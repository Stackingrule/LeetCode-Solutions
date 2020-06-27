class Solution {
public:
    vector<int> getLeastNumbers(vector<int>& arr, int k) {
        priority_queue<int> q;//默认最大堆
       	for (int a : arr) {
          if (q.size() < k) {
            q.push(a);
          }
          else {
            if (!q.empty() && a < q.top()) {
              q.pop();
              q.push(a);
            }
          }
        }

        vector<int> res;
        while (!q.empty()) {
          res.push_back(q.top());
          q.pop();
        }
        return res;
    }
};
