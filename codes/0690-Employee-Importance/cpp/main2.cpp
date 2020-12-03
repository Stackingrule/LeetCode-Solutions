/*
// Definition for Employee.
class Employee {
public:
    int id;
    int importance;
    vector<int> subordinates;
};
*/

class Solution
{
public:
    int getImportance(vector<Employee *> employees, int id)
    {
        int ans = 0;
        queue<int> q{{id}};
        unordered_map<int, Employee *> m;
        for (auto e : employees)
            m[e->id] = e;
        while (!q.empty())
        {
            auto t = q.front();
            q.pop();
            ans += m[t]->importance;
            for (auto num : m[t]->subordinates)
            {
                q.push(num);
            }
        }
        return ans;
    }
};