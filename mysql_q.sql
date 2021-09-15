create table regions(
region_id int unsigned not null primary key,
region_name varchar(45));
insert into regions(region_id,region_name) values(11,"asia");
select* from regions;

create table countries(
country_id int unsigned not null primary key,
country_name varchar(255),
region_id int unsigned not null);
insert into countries(country_id,country_name,region_id) values(91,"india",111);
insert into countries values(91,"india",111);
select* from countries;

create table locations(
location_id int unsigned not null auto_increment primary key,
street_address varchar(255),
postal_cod varchar(250),
city varchar(255) not null,
state_province varchar(250),
country_id char not null);
insert into locations values(1,"bangalore",560021,"kormangala","karnataka",91);
insert into locations values(1,"bangalore",560021,"kormangala","karnataka",1);
insert into locations values(11,"bangalore",560021,"kormangala","karnataka",1);
insert into locations values(12,"bangalore",562021,"kormangala","karnataka",91);
insert into locations values(111,"bangalore",562021,"kormangala","karnataka",91);

create table departments(
department_id int unsigned not null primary key,
department_name varchar(255) not null,
manager_id int unsigned primary key,
location_id int unsigned);
insert into departments values(1,"ase",11,111);
insert into departments values(5,"ase",11,111);

create table jobs(
job_id varchar(255) not null primary key,
job_title varchar(255) not null,
min_salary decimal unsigned,
max_salary decimal unsigned);
insert into jobs values(1,"ase",1.5,2.5);
insert into jobs values("ta12","ase1",2.2,3.3);

create table employees(
employee_id int unsigned not null primary key,
first_name varchar(255),
last_name varchar(255) not null,
email varchar(250) not null,
phone_number varchar(250),
hire_date date not null,
job_id varchar(255) not null,
salary decimal not null,
commission_pct decimal,
manager_id int unsigned primary key,
department_id int unsigned not null unique key);
insert into employees values(1,"aish","khonde","aish@gmail.com","9112345679",("2021-09-14"),"ta12",5.5,1.2,111,111);
insert into employees values(4,"aish","khonde","aish@gmail.com","9112345679",("2021-09-14"),"ta12",5.5,1.2,11,111);
insert into employees values(7,"aish","khonde","aish@gmail.com","9112345679",("2021-09-14"),"ta12",5.5,1.2,11,11);

create table job_history( 
employee_id int unsigned not null,
start_date date not null,
end_date date not null,
job_id varchar(255) not null,
department_id int unsigned not null unique key);
insert into job_history values(1,("2000-09-14"),("2021-09-14"),"ta12",11);
insert into job_history values(12,("2001-09-14"),("2011-09-14"),"ta12",111);
insert into job_history values(11,("2001-09-14"),("2011-09-14"),"ta12",111);
insert into job_history values(5,("2001-09-14"),("2011-09-14"),"ta12",111);

alter table countries add foreign key (region_id) references regions(region_id);
alter table locations add foreign key (country_id) references countries(country_id);
alter table departments add foreign key (location_id) references locations(location_id);
alter table employees add foreign key (job_id) references jobs (job_id);
alter table employees add foreign key (department_id) references departments (department_id);
alter table employees add foreign key (manager_id) references departments (manager_id);
alter table departments add foreign key (manager_id) references employees (manager_id); 
alter table job_history add foreign key (employee_id) references employees (employee_id);
set foreign_key_checks = 0;
alter table job_history add foreign key (employee_id) references employees (employee_id);
alter table job_history add foreign key (job_id) references employees (job_id);
alter table job_history add foreign key (department_id) references departments (department_id);