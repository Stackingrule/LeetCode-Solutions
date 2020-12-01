# Write your MySQL query statement below
SELECT
    (CASE
##如果id初二不等于0，说明是奇数，并且不是最后一个，id+1;
        WHEN MOD(id, 2) != 0 AND counts != id THEN id + 1
##如果是最后一个奇数，那就id不变
        WHEN MOD(id, 2) != 0 AND counts = id THEN id
##其他的都是偶数，减一。
        ELSE id - 1
    END) AS id,
    student
FROM
    seat,
    ##一共有多少条数据
    (
SELECT
    COUNT(*) AS counts
FROM
    seat
) AS seat_counts
ORDER BY id ASC;