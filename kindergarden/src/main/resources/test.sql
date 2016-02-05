create schema kindergarden;

create table kindergarden.child (
	child_id  integer CONSTRAINT firstkey PRIMARY KEY,
	name varchar(40),
	surname varchar(40),
	age integer
);

create sequence hibernate_sequence NO MAXVALUE start with 1000;

select * from kindergarden.child

create table kindergarden.group (
	group_id  integer CONSTRAINT group_key PRIMARY KEY,
	name varchar(40)
);

create table kindergarden.kindergarden (
	garden_id  integer CONSTRAINT garden_key PRIMARY KEY,
	name varchar(40)
);


alter table kindergarden.child drop column age;
alter table kindergarden.child 
add burth_date DATE;

