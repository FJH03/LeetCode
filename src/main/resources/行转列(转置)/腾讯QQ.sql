create schema if not exists test;
use test;

## group by + sum(if())

#scene
drop table if exists tableA;
create table tableA
(
    qq   varchar(10),
    game varchar(8)
);
insert tableA
values (10000, 'a'),
       (10000, 'b'),
       (10000, 'c'),
       (20000, 'c'),
       (20000, 'd');

select qq,
       game
from tableA;

#solve
select qq,
       GROUP_CONCAT(game SEPARATOR '_') games
from tableA
group by qq;

drop schema test;
