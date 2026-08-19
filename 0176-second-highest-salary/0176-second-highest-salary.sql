SELECT IFNULL(
    (
        SELECT salary
        FROM (
            SELECT DISTINCT salary,
                   DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
            FROM Employee
        ) AS ranked
        WHERE rnk = 2
        LIMIT 1
    ),
    NULL
) AS SecondHighestSalary;