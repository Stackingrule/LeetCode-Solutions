/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return helper(map, id);
    }

    private int helper(HashMap<Integer, Employee> map, int id) {
        Employee root = map.get(id);
        int total = root.importance;
        for (int subordinate : root.subordinates) {
            total += helper(map, subordinate);
        }
        return total;
    }
}