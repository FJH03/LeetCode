create schema if not exists test;
use test;

#题目：现在运营想要看一下男性用户有多少人以及他们的平均gpa是多少，用以辅助设计相关活动，请你取出相应数据。

#scene
drop table if exists user_profile;
CREATE TABLE `user_profile` (
                                `id` int NOT NULL,
                                `device_id` int NOT NULL,
                                `gender` varchar(14) NOT NULL,
                                `age` int ,
                                `university` varchar(32) NOT NULL,
                                `gpa` float);
INSERT INTO user_profile VALUES(1,2138,'male',21,'北京大学',3.4);
INSERT INTO user_profile VALUES(2,3214,'male',null,'复旦大学',4.0);
INSERT INTO user_profile VALUES(3,6543,'female',20,'北京大学',3.2);
INSERT INTO user_profile VALUES(4,2315,'female',23,'浙江大学',3.6);
INSERT INTO user_profile VALUES(5,5432,'male',25,'山东大学',3.8);
INSERT INTO user_profile VALUES(6,2131,'male',28,'北京师范大学',3.3);

#solve
select
    count(1) as male_num,
    round(avg(gpa), 1) as avg_gpa
from
    user_profile
where
    gender = 'male';

drop schema test;
