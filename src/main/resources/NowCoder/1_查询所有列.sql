create schema if not exists test;
use test;

#题目：现在运营想要查看用户信息表中所有的数据，请你取出相应结果

#scene
drop table if exists user_profile;
CREATE TABLE `user_profile`
(
    `id`         int         NOT NULL,
    `device_id`  int         NOT NULL,
    `gender`     varchar(14) NOT NULL,
    `age`        int,
    `university` varchar(32) NOT NULL,
    `province`   varchar(32) NOT NULL
);
INSERT INTO user_profile
VALUES (1, 2138, 'male', 21, '北京大学', 'BeiJing');
INSERT INTO user_profile
VALUES (2, 3214, 'male', null, '复旦大学', 'Shanghai');
INSERT INTO user_profile
VALUES (3, 6543, 'female', 20, '北京大学', 'BeiJing');
INSERT INTO user_profile
VALUES (4, 2315, 'female', 23, '浙江大学', 'ZheJiang');
INSERT INTO user_profile
VALUES (5, 5432, 'male', 25, '山东大学', 'Shandong');

#solve
select id,
       device_id,
       gender,
       age,
       university,
       province
from user_profile;

drop schema test;
