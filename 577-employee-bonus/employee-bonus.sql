# Write your MySQL query statement below



select e.name as name , b.bonus as bonus
from employee e
left join bonus b
on b.empId = e.empId
where b.bonus < 1000 or b.bonus is null;