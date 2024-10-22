create schema if not exists test;
use test;

#题目：现在运营想查看所有大学中带有北京的用户的信息，请你取出相应数据。

/**
1. _ ：下划线 代表匹配任意一个字符；
2. % ：百分号 代表匹配0个或多个字符；
3. []: 中括号 代表匹配其中的任意一个字符；
4. [^]: ^尖冒号 代表 非，取反的意思；不匹配中的任意一个字符。
 */

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
VALUES (1, 2138, 'male', 21, '北京大学', 3.4);
INSERT INTO user_profile
VALUES (2, 3214, 'male', null, '复旦大学', 4.0);
INSERT INTO user_profile
VALUES (3, 6543, 'female', 20, '北京大学', 3.2);
INSERT INTO user_profile
VALUES (4, 2315, 'female', 23, '浙江大学', 3.6);
INSERT INTO user_profile
VALUES (5, 5432, 'male', 25, '山东大学', 3.8);
INSERT INTO user_profile
VALUES (6, 2131, 'male', 28, '北京师范大学', 3.3);

#solve
select device_id,
       age,
       university
from user_profile
where university like '%北京%';

drop schema test;
