# Write your MySQL query statement below
SELECT a.Name AS Employee
FROM employee a, employee b
WHERE a.ManagerId = b.Id 
and a.Salary > b.Salary;