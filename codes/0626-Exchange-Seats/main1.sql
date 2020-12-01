# Write your MySQL query statement below
SELECT (CASE
            WHEN id % 2 = 1 AND id != C THEN id+1
            WHEN id % 2 = 1 AND id  = C THEN id
       ELSE id-1 END) AS id,student
FROM seat,(SELECT COUNT(1) AS C FROM seat) AS T
ORDER BY id;