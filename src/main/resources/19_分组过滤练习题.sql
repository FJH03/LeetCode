create schema if not exists test;
use test;

#题目：现在运营想查看每个学校用户的平均发贴和回帖情况，寻找低活跃度学校进行重点运营，请取出平均发贴数低于5的学校或平均回帖数小于20的学校。

#scene
drop table if exists user_profile;
CREATE TABLE `user_profile`
(
    `id`                    int         NOT NULL,
    `device_id`             int         NOT NULL,
    `gender`                varchar(14) NOT NULL,
    `age`                   int,
    `university`            varchar(32) NOT NULL,
    `gpa`                   float,
    `active_days_within_30` int,
    `question_cnt`          float,
    `answer_cnt`            float
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

#solve
select university,
       avg(question_cnt) avg_question_cnt,
       avg(answer_cnt)   avg_answer_cnt
from user_profile
group by university
having avg(question_cnt) < 5
    or avg(answer_cnt) < 20;

drop schema test;
