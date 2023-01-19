 create table book(
 id serial,
 name varchar(256),
 writer varchar(30),
 pub varchar(30),
 ISBN int,
 login_id int,
 primary key(id),
 foreign key(login_id) references login(id)
 );
 
 create table login(
 id serial,
 name varchar(256),
 mail varchar(256),
 pw int,
 salt varchar(64),
 primary key(id)
 );