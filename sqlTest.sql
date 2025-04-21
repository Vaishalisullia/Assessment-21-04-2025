--Q1
create table students(
id serial primary key,
name varchar(50) not null,
email varchar(50) unique,
age int,
marks decimal(5,2)
)

insert into students (id,name,email,age,marks)
values(1,'Anil','anil@gmail.com',21,75.7),
(2,'Bob','bob@gmail.com',22,80),
(3,'Charlie','charlie@gmail.com',23,40),
(4,'Akash','akash@gmail.com',17,80),
(5,'Rahul','rahul123@gmail.com',18,30);

select * from students;
--Q2
select * from students where age>21;

--Q3
update students set email='rahul@gmail.com' 
where id=5;
select * from students;
--Q4
delete from students where age<18;
select * from students;

--Q5
select * from students order by marks desc limit 1 offset 1;



--Q5
create table students1(
student_id int primary key,
name varchar(50),
age int);

create table Courses(
course_id int primary key,
student_id int,
course_name varchar(50),
foreign key (student_id) references students1(student_id));

insert into students1 (student_id,name,age)values
(1,'Rahul',22),
(2,'Priya',21),
(3,'Akash',23);
select * from students1;
insert into Courses(course_id,student_id,course_name) values
(101,1,'Java'),
(102,2,'Python'),
(103,1,'SQL')
select * from Courses;

--Q6

select s.name,c.course_name from students1 s 
inner join Courses c on s.student_id=c.student_id; 
