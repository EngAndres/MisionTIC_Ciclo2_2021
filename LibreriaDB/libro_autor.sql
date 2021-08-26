DROP TABLE IF EXISTS libro_autor;
CREATE TABLE libro_autor(
	id_libro_autor int AUTO_INCREMENT,
	id_libro_fk int NOT NULL,
	id_autor_fk int NOT NULL,
	PRIMARY KEY(id_libro_autor),
	FOREIGN KEY(id_autor_fk) REFERENCES autor(aut_codigo),
	FOREIGN KEY(id_libro_fk) REFERENCES libro(id_ISBN)
);
INSERT INTO libro_autor(id_libro_fk, id_autor_fk) 
VALUES (456, 147852);
INSERT INTO libro_autor(id_libro_fk, id_autor_fk) 
VALUES (324, 32158);
