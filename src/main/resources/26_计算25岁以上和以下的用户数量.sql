create schema if not exists test;
use test;

#题目：现在运营想要将用户划分为25岁以下和25岁及以上两个年龄段，分别查看这两个年龄段用户数量
#本题注意：age为null 也记为 25岁以下

#scene
drop table if exists `user_profile`;
CREATE TABLE `user_profile`
(
    `id`                    int         NOT NULL,
    `device_id`             int         NOT NULL,
    `gender`                varchar(14) NOT NULL,
    `age`                   int,
    `university`            varchar(32) NOT NULL,
    `gpa`                   float,
    `active_days_within_30` int,
    `question_cnt`          int,
    `answer_cnt`            int
);
INSERT INTO user_profile
VALUES (1, 2138, 'male', 21, '北京大学', 3.4, 7, 2, 12);
INSERT INTO user_profile
VALUES (2, 3214, 'male', null, '复旦大学', 4.0, 15, 5, 25);
INSERT INTO user_profile
VALUES (3, 6543, 'female', 20, '北京大学', 3.2, 12, 3, 30);
INSERT INTO user_profile
VALUES (4, 2315, 'female', 23, '浙江大学', 3.6, 5, 1, 2);
INSERT INTO user_profile
VALUES (5, 5432, 'male', 25, '山东大学', 3.8, 20, 15, 70);
INSERT INTO user_profile
VALUES (6, 2131, 'male', 28, '山东大学', 3.3, 15, 7, 13);
INSERT INTO user_profile
VALUES (7, 4321, 'male', 28, '复旦大学', 3.6, 9, 6, 52);


#solve1
SELECT IF(age >= 25, '25岁及以上', '25岁以下') AS age_cut, count(1) AS number
FROM user_profile
GROUP BY age_cut;

#solve2
SELECT '25岁以下' age_cut, COUNT(device_id) Number
FROM user_profile
WHERE age < 25
   OR age IS NULL
UNION
SELECT '25岁及以上' age_cut, COUNT(device_id) Number
FROM user_profile
WHERE age >= 25;

drop schema test;
