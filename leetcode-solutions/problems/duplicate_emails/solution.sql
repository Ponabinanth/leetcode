select distinct email as Email from (
select email, count(email) from Person group by email having count(email)>1) a
