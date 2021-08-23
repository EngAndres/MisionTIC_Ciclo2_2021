DROP TABLE IF EXISTS editorial;
CREATE TABLE editorial( 
	id_editorial int AUTO_INCREMENT, 
	nombre varchar(20) NOT NULL UNIQUE, 
	ciudad varchar(30) NULL, 
	telefono varchar(15) NOT NULL, 
	pais varchar(20) NULL, 
	PRIMARY KEY(id_editorial)
);
INSERT INTO editorial(nombre, ciudad, telefono, pais) 
VALUES ('CuentosMelos', 'Bogota', '+016548732', 'Colombia');
INSERT INTO editorial(nombre, telefono) 
VALUES ('LibrosLibres', '321654987456');
INSERT INTO editorial(nombre, telefono, pais) 
VALUES ('Libreichons', '321654987456', 'USA');
