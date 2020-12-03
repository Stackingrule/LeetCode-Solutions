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
        unordered_map<int, Employee *> m;
        for (auto e : employees)
            m[e->id] = e;
        return helper(id, m);
    }

    int helper(int id, unordered_map<int, Employee *> m)
    {

        int ans = m[id]->importance;
        for (int num : m[id]->subordinates)
        {
            ans += helper(num, m);
        }
        return ans;
    }
};