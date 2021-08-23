DROP TABLE IF EXISTS libro;
CREATE TABLE libro(
	id_ISBN int NOT NULL PRIMARY KEY,
	titulo varchar(100) NOT NULL,
	num_paginas int NULL,
	anio int NOT NULL,
	id_editorial_fk int NOT NULL,
	FOREIGN KEY(id_editorial_fk) REFERENCES editorial(id_editorial)
);
INSERT INTO libro(id_ISBN, titulo, num_paginas, anio, id_editorial_fk) 
VALUES (897, 'Python', '40', '2020', 3);
INSERT INTO libro(id_ISBN, titulo, num_paginas, anio, id_editorial_fk) 
VALUES (456, 'Como ser un programador senior', '200', '2021', 1);
