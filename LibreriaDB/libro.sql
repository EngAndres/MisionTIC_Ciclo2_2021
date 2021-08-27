DROP TABLE IF EXISTS libro;
CREATE TABLE libro(
	id_ISBN int NOT NULL PRIMARY KEY,
	titulo varchar(100) NOT NULL,
	num_paginas int NULL,
	anio int NOT NULL,
	precio decimal(15,2) NOT NULL,
	id_editorial_fk int NOT NULL,
	en_bodega boolean DEFAULT false,
	FOREIGN KEY(id_editorial_fk) REFERENCES editorial(id_editorial)
);
INSERT INTO libro(id_ISBN, titulo, num_paginas, anio, id_editorial_fk, precio, en_bodega) 
VALUES (897, 'Python', '40', '2020', 3, 98.2, true);
INSERT INTO libro(id_ISBN, titulo, num_paginas, anio, id_editorial_fk, precio) 
VALUES (456, 'Como ser un programador senior', '200', '2021', 1, 12.5);
INSERT INTO libro(id_ISBN, titulo, anio, id_editorial_fk, precio)
VALUES (324,'El olvido que seremos','2005',2, 11.34);
