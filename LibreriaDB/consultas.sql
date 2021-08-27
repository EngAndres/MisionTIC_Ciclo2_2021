SELECT 'Consulta 1';
SELECT libro.id_ISBN as ISBN, libro.titulo AS Titulo, libro.num_paginas AS NumeroPaginas, libro.anio AS Año, editorial.nombre AS Editorial, editorial.telefono AS TelefonoEditorial 
FROM libro 
JOIN editorial ON libro.id_editorial_fk=editorial.id_editorial;
SELECT 'Consulta 2';
SELECT libro_autor.id_libro_autor AS Consecutivo, libro.titulo AS Libro, libro.anio AS Año, editorial.nombre AS Editorial, autor.nombre AS NombreAutor, autor.apellido AS ApellidoAutor 
FROM libro_autor 
JOIN libro ON libro_autor.id_libro_fk=libro.id_ISBN
JOIN editorial ON libro.id_editorial_fk=editorial.id_editorial
JOIN autor ON libro_autor.id_autor_fk=autor.aut_codigo;
SELECT 'Consulta 3';
SELECT compra.id_compra AS NúmeroFactura, compra.fecha AS Fecha, cliente.nombre AS Cliente, cliente.telefono AS Teléfono, cliente.direccion AS Dirección, libro.titulo AS Libro, libro.anio AS AñoDeLibro, editorial.nombre AS Editorial, autor.nombre AS NombreAutor, autor.apellido AS ApellidoAutor 
FROM compra, cliente, libro_autor, libro, editorial, autor 
WHERE (compra.id_libro_fk=libro.id_ISBN AND compra.id_cliente_fk=cliente.id_cliente AND libro_autor.id_libro_fk=libro.id_ISBN AND libro_autor.id_autor_fk=autor.aut_codigo AND libro.id_editorial_fk=editorial.id_editorial)
ORDER BY compra.id_compra;
SELECT 'Consulta 4';
SELECT compra.id_compra AS "Número Factura", compra.fecha AS "Fecha de Factura", cliente.nombre AS Cliente, cliente.telefono AS Teléfono, cliente.direccion AS Dirección, libro.titulo AS "Título de Libro", libro.anio AS "Año De Libro", editorial.nombre AS Editorial, CONCAT(autor.nombre, CONCAT(" ", autor.apellido)) AS "Nombre Autor" 
FROM compra
JOIN cliente ON compra.id_cliente_fk=cliente.id_cliente
JOIN libro ON compra.id_libro_fk=libro.id_ISBN
JOIN libro_autor ON libro_autor.id_libro_fk=libro.id_ISBN
JOIN autor ON libro_autor.id_autor_fk=autor.aut_codigo
JOIN editorial ON libro.id_editorial_fk=editorial.id_editorial
WHERE cliente.nombre LIKE '%Juan%'
ORDER BY compra.fecha DESC;
