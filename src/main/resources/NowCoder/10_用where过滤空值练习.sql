create schema if not exists test;
use test;

#题目：现在运营想要对用户的年龄分布开展分析，在分析时想要剔除没有获取到年龄的用户，请你取出所有年龄值不为空的用户的设备ID，性别，年龄，学校的信息。

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

#solve1
select device_id,
       gender,
       age,
       university
from user_profile
where age is not null
  and age <> '';
#推荐

#solve2
select device_id,
       gender,
       age,
       university
from user_profile
where age != 'null';

drop schema test;
