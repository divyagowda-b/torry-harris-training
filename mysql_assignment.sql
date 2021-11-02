create table employee1 (
empno int not null,
ename varchar(255) not null,
job varchar(255) not null,
hiredate date not null,
mgr int ,
sal int not null,
comm int,
deptno int not null);
 insert into employee1 values(7369,"smith","clerk",STR_TO_DATE('17-dec-80','%d-%M-%Y'),7902,800,null,20);
 insert into employee1 values(7499,"allen","salesman",STR_TO_DATE('20-feb-81','%d-%M-%Y'),7698,1600,300,30);
insert into employee1 values(7521,"ward","salesman",STR_TO_DATE('22-feb-81','%d-%M-%Y'),7698,1250,500,30);
insert into employee1 values(7566,"jones","manager",STR_TO_DATE('2-feb-81','%d-%M-%Y'),7839,2975,null,20);
insert into employee1 values(7654,"martin","salesman",STR_TO_DATE('28-feb-81','%d-%M-%Y'),7698,1250,1400,30);
insert into employee1 values(7698,"blake","manager",STR_TO_DATE('01-may-81','%d-%M-%Y'),7839,2850,null,30);
insert into employee1 values(7782,"clark","manager",STR_TO_DATE('09-june-81','%d-%M-%Y'),7839,2450,null,10);
insert into employee1 values(7788,"scott","analyst",STR_TO_DATE('19-april-87','%d-%M-%Y'),7566,3000,null,20);
insert into employee1 values(7744,"turner","salesman",STR_TO_DATE('08-sep-81','%d-%M-%Y'),7698,1500,0,30);
insert into employee1 values(7876,"adams","clerk",STR_TO_DATE('23-may-87','%d-%M-%Y'),7788,1100,null,20);
insert into employee1 values(7900,"james","clerk",STR_TO_DATE('03-dec-81','%d-%M-%Y'),7698,950,null,30);
insert into employee1 values(7902,"ford","analyst",STR_TO_DATE('03-dec-81','%d-%M-%Y'),7566,3000,null,20);
insert into employee1 values(7934,"miller","clerk",STR_TO_DATE('23-june-82','%d-%M-%Y'),7782,1300,null,10);
select ename from employee1 where deptno=30;
select ename,empno,deptno from employee1 where job="clerk";
select ename,deptno from employee1 where deptno > 20;
select ename from employee1 where comm > sal;
select ename,job,sal from employee1 where deptno=20 and sal>2000;
select* from employee1 where job="salesman" and deptno=30 and sal>1500;
select* from employee1 where job IN ('manager','president');
select* from employee1 where job="manager" and deptno not in(30);


