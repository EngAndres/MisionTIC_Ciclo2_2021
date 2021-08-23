DROP TABLE IF EXISTS cliente;
CREATE TABLE cliente(
	id_cliente int AUTO_INCREMENT,
	nombre varchar(50) NOT NULL,
	telefono varchar(16) NOT NULL,
	direccion varchar(50) NOT NULL,
	PRIMARY KEY(id_cliente)
);
INSERT INTO cliente(nombre, telefono, direccion) 
VALUES ('Juanito Perigollaz', '+13258975556', 'Calle SiempreViva 654');
INSERT INTO cliente(nombre, telefono, direccion) 
VALUES ('Chavela Chevere', '321584355124', 'Carrera La Herrera');
