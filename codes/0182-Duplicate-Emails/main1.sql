# Write your MySQL query statement below
SELECT DISTINCT p.Email
FROM Person p
GROUP BY p.Email
having count(p.Email) > 1;