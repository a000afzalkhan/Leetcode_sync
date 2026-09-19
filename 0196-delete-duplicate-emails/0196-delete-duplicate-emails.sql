# Write your MySQL query statement below
DELETE FROM Person 
Where id NOT In (
    Select min_id
    From
    (Select min(id) as min_id from Person Group By email) t

    );