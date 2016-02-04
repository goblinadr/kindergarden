create schema kindergarden;

create table kindergarden.child (
	child_id  integer CONSTRAINT firstkey PRIMARY KEY,
	name varchar(40),
	surname varchar(40),
	age integer
);

create sequence hibernate_sequence NO MAXVALUE start with 1000;

select * from kindergarden.child