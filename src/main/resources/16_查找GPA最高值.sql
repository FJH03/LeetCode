create schema if not exists test;
use test;

#题目：运营想要知道复旦大学学生gpa最高值是多少，请你取出相应数据

#scene
drop table if exists user_profile;
CREATE TABLE `user_profile`
(
    `id`         int         NOT NULL,
    `device_id`  int         NOT NULL,
    `gender`     varchar(14) NOT NULL,
    `age`        int,
    `university` varchar(32) NOT NULL,
    `gpa`        float
);
INSERT INTO user_profile
VALUES (1, 2234, 'male', 21, '北京大学', 3.2);
INSERT INTO user_profile
VALUES (2, 2235, 'male', null, '复旦大学', 3.8);
INSERT INTO user_profile
VALUES (3, 2236, 'female', 20, '复旦大学', 3.5);
INSERT INTO user_profile
VALUES (4, 2237, 'female', 23, '浙江大学', 3.3);
INSERT INTO user_profile
VALUES (5, 2238, 'male', 25, '复旦大学', 3.1);
INSERT INTO user_profile
VALUES (6, 2239, 'male', 25, '北京大学', 3.6);
INSERT INTO user_profile
VALUES (7, 2240, 'male', null, '清华大学', 3.3);
INSERT INTO user_profile
VALUES (8, 2241, 'female', null, '北京大学', 3.7);

#solve1
select max(gpa) as gpa
from user_profile
where university in ('复旦大学');

#solve2
select gpa
from user_profile
where university in ('复旦大学')
order by gpa desc
limit 0, 1;

drop schema test;
