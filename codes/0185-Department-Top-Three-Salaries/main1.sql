# Write your MySQL query statement below
Select c.Department as Department, c.Employee as Employee, c.Salary as Salary from
(
SELECT b.Name as Department,
a.Name as Employee,
a.Salary as Salary,
DENSE_RANK() OVER (PARTITION BY b.Name ORDER BY a.Salary desc) as `rank`
from Employee a, Department b where a.DepartmentId = b.Id) c
where c.rank <=3