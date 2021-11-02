create table students(
regd_no int not null,
std_name varchar(255) not null,
branch varchar(255) not null);
insert into students values(001,"ram","CSE");
insert into students values(002,"hari","MECH");
insert into students values(003,"pradeep","EEE");
insert into students values(004,"deepak","ETC");
select regd_no from students where std_name="pradeep";
select std_name,branch from students;
select count(*) from students;
alter table students add address varchar(250);