# Write your MySQL query statement below
update salary SET sex=Case sex
when 'm' then 'f'
else 'm'
END;