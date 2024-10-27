create schema if not exists test;
use test;

## group by + sum(if())

#scene
drop table if exists table1;
create table table1
(
    DData   DATE,
    shengfu varchar(2)
);
insert table1
values ('2015-05-09', '胜'),
       ('2015-05-09', '胜'),
       ('2015-05-09', '负'),
       ('2015-05-09', '负'),
       ('2015-05-10', '胜'),
       ('2015-05-10', '负'),
       ('2015-05-10', '负');

select DData,
       shengfu
from table1;

#solve
select DData,
       SUM(shengfu = '胜') 胜,
       SUM(shengfu = '负') 负
from table1
group by DData;

drop schema test;
