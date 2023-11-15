```sql
select  B.unique_id, A.name  from  Employees  A left outer join EmployeeUNI  B
on A.id=B.id
```
