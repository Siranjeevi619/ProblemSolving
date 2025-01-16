# Write your MySQL query statement below
select product_name, year, price 
from sales s
inner join  product p 
where p.product_id = s.product_id;