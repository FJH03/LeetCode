create schema if not exists test;
use test;

## group by + sum(if())

#scene
drop table if exists table2;
create table table2
(
    year   int,
    month  int,
    amount decimal(10, 1)
);

insert table2
values (1991, 1, 1.1),
       (1991, 1, 1.4),
       (1991, 2, 1.2),
       (1991, 2, 1.4),
       (1991, 3, 1.3),
       (1991, 4, 1.4),
       (1992, 1, 2.1),
       (1992, 2, 2.2),
       (1992, 3, 2.3),
       (1992, 4, 2.4);

select year,
       month,
       amount
from table2;


#solve
select year,
       sum(if(month = 1, amount, 0)) m1,
       sum(if(month = 2, amount, 0)) m2,
       sum(if(month = 3, amount, 0)) m3,
       sum(if(month = 4, amount, 0)) m4
from table2
group by year;

drop schema test;
