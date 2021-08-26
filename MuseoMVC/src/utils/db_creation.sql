CREATE SCHEMA museo;
USE museo;

DROP TABLE IF EXISTS museo;
CREATE TABLE museo(
	mu_id     int PRIMARY KEY,
	mu_nombre varchar(30) NOT NULL UNIQUE
);
INSERT INTO museo VALUES(101, 'Louvre'); 
INSERT INTO museo VALUES(102, 'Met');
INSERT INTO museo VALUES(205, 'Shangai');
INSERT INTO museo VALUES(304, 'Británico');



DROP TABLE IF EXISTS exposicion;
CREATE TABLE exposicion(
	ex_id     int PRIMARY KEY,
	ex_nombre varchar(30) NOT NULL
);
INSERT INTO exposicion VALUES(1003 , 'Da Vinci');
INSERT INTO exposicion VALUES(1004 , 'Renacimiento');
INSERT INTO exposicion VALUES(1005 , 'Cubismo');
INSERT INTO exposicion VALUES(1006 , 'Impresionismo');



DROP TABLE IF EXISTS obra;
CREATE TABLE obra(
	ob_id     int PRIMARY KEY,
	ob_nombre varchar(30) NOT NULL,
   	ob_tipo   varchar(30) DEFAULT 'arte',
   	ob_costo  decimal(10,1) NOT NULL,
   	ob_ex_id  int REFERENCES exposicion(ex_id)
);
INSERT INTO obra VALUES(111, 'Mona lisa', 'pintura', 1000, 1003);
INSERT INTO obra VALUES(112, 'Ultima cena', 'pintura', 800, 1003);
INSERT INTO obra VALUES(113, 'Hombre vitruvio', 'boceto', 400, 1003);
INSERT INTO obra VALUES(114, 'Planos', 'planos', 200, 1003);
INSERT INTO obra VALUES(200, 'Fornarina', 'pintura', 400, 1004);
INSERT INTO obra VALUES(201, 'David', 'escultura', 700, 1004);
INSERT INTO obra VALUES(202, 'Nacimiento de Venus', 'pintura', 250, 1004);
INSERT INTO obra VALUES(300, 'Violin and candless', 'pintura', 300, 1005);
INSERT INTO obra VALUES(301, 'Les demoiselles', 'pintura', 350, 1005);
INSERT INTO obra VALUES(302, 'Cabeza de mujer', 'escultura', 300, 1005);
INSERT INTO obra VALUES(400, 'Autoretrato', 'pintura', 100, 1006);
INSERT INTO obra VALUES(401, 'La parade', 'pintura', 300, 1006);
INSERT INTO obra VALUES(402, 'Solei levant', 'pintura', 300, 1006);



DROP TABLE IF EXISTS presentacion;
CREATE TABLE presentacion(
	pre_id          int AUTO_INCREMENT,
	pre_fechainicial varchar(30) NOT NULL,
	pre_ob_id       int NOT NULL,
	pre_mu_id       int NOT NULL,
	PRIMARY KEY(pre_id),
	FOREIGN KEY(pre_ob_id) REFERENCES obra(ob_id),
	FOREIGN KEY(pre_mu_id) REFERENCES museo(mu_id)
);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Ene-mar-2013', 111, 101);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Oct-dic-2013', 111, 101);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Ene-mar-2013', 112, 101);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('May-sept-2013', 200, 101);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('May-sept-2013', 201, 101);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Oct-dic-2013', 113, 101);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Ene-jul-2013', 300, 102);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES( 'Ene-jul-2013', 301, 102);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES( 'Abr-jun-2013', 113, 102);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Sept-2013', 113, 102);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Abr-jun-2013', 112, 102);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Sept-2013', 112, 102);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Ene-abr-2013', 202, 102);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Ene-abr-2013', 201, 102);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Julio 2013', 113, 205);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Julio 2013', 114, 205);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Marz-jun-2013', 401, 205);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Marz-jun-2013', 402,205);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Oct-dic-2013', 301, 205);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Oct-dic-2013', 302, 205);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Oct-dic-2013', 200, 205);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Oct-dic-2013', 202, 205);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Ago-nov-2013', 402, 304);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Ago-nov-2013', 400, 304);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Jul-ago-2013', 114, 304);
INSERT INTO presentacion(pre_fechainicial, pre_ob_id, pre_mu_id) VALUES('Jul-ago-2013', 111, 304);
