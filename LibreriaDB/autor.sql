DROP TABLE IF EXISTS autor;
CREATE TABLE autor(
	aut_codigo int NOT NULL PRIMARY KEY,
	nombre varchar(30) NOT NULL,
	apellido varchar(30) NOT NULL,
	nacionalidad varchar(40) DEFAULT '',
	fecha_nacimiento date NOT NULL
);
INSERT INTO autor(aut_codigo, nombre, apellido, nacionalidad, fecha_nacimiento) 
VALUES (147852, 'Pepita', 'Perez', 'Colombiana', '1965-11-19');
INSERT INTO autor(aut_codigo, nombre, apellido, fecha_nacimiento) 
VALUES (32158, 'Hector', 'Abad', '1958-10-01');
