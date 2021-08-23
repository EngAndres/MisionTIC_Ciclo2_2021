DROP TABLE IF EXISTS compra;
CREATE TABLE compra(
	id_compra int AUTO_INCREMENT,
	id_libro_fk int NOT NULL, 
	id_cliente_fk int NOT NULL,
	fecha timestamp NOT NULL DEFAULT NOW(),
	PRIMARY KEY(id_compra),
	FOREIGN KEY(id_libro_fk) REFERENCES libro(id_ISBN),
	FOREIGN KEY(id_cliente_fk) REFERENCES cliente(id_cliente)
);
INSERT INTO compra(id_libro_fk, id_cliente_fk, fecha) 
VALUES (456, 1, '2021-08-21');
INSERT INTO compra(id_libro_fk, id_cliente_fk)  
VALUES (456, 2);
