CREATE DATABASE books;


CREATE TABLE book
(
id INT(11),
title VARCHAR(64),
author_name VARCHAR(32),
price INT(11)
);

INSERT INTO book
(id, title, author_name, price)
values (1, "What's Pivotal", "Rob Mee", 1500);
INSERT INTO book
(id, title, author_name, price)
values (2, "eXtream Programming", "Kent Beck", 1200);
INSERT INTO book
(id, title, author_name, price)
values (3, "Site Reliability Engineering", "Google", 5600);
INSERT INTO book
(id, title, author_name, price)
values (4, "Introduction of Concourse CI", "Pivotal CI Team", 4900);
INSERT INTO book
(id, title, author_name, price)
values (5, "Pivotal Cloud Foundry Deep Dive", "Pivotal Japan", 8900);