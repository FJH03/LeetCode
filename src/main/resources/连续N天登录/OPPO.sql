create schema if not exists test;
use test;

#scene
drop table if exists table1;
create table table1
(
    name   varchar(10),
    ’date‘ DATE
);

insert table1
values ('张三', '2021-01-01'),
       ('张三', '2021-01-02'),
       ('张三', '2021-01-03'),
       ('张三', '2021-01-02'),
       ('李四', '2021-01-01'),
       ('李四', '2021-01-02'),
       ('王五', '2021-01-03'),
       ('王五', '2021-01-02'),
       ('王五', '2021-01-02');

select name, ’date‘
from table1;

#solve
with t1 as (select distinct name,
                            ’date‘
            from table1),
     t2 as (select name,
                   ’date‘,
                   row_number() over (partition by name
                       order by ’date‘) rn
            from t1),
     t3 as (select *,
                   date_sub(’date‘, INTERVAL rn day) temp
            from t2),
     t4 as (select name, temp,
                   count(1) cnt
            from t3
            group by name,
                     temp
            having cnt >= 3)
select distinct name
from t4;


drop schema test;
