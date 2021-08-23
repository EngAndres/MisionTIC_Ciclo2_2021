SELECT libro.id_ISBN as ISBN, libro.titulo AS Titulo, libro.num_paginas AS NumeroPaginas, libro.anio AS Año, editorial.nombre AS Editorial, editorial.telefono AS TelefonoEditorial 
FROM libro JOIN editorial 
WHERE libro.id_editorial_fk=editorial.id_editorial;

SELECT libro_autor.id_libro_autor AS Consecutivo, libro.titulo AS Libro, libro.anio AS Año, editorial.nombre AS Editorial, autor.nombre AS NombreAutor, autor.apellido AS ApellidoAutor 
FROM libro_autor JOIN libro JOIN editorial JOIN autor 
WHERE (libro_autor.id_libro_fk=libro.id_ISBN AND libro_autor.id_autor_fk=autor.aut_codigo AND libro.id_editorial_fk=editorial.id_editorial);

SELECT compra.id_compra AS NúmeroFactura, compra.fecha AS Fecha, cliente.nombre AS Cliente, cliente.telefono AS Teléfono, cliente.direccion AS Dirección, libro.titulo AS Libro, libro.anio AS AñoDeLibro, editorial.nombre AS Editorial, autor.nombre AS NombreAutor, autor.apellido AS ApellidoAutor 
FROM compra JOIN cliente JOIN libro_autor JOIN libro JOIN editorial JOIN autor 
WHERE (compra.id_libro_fk=libro.id_ISBN AND compra.id_cliente_fk=cliente.id_cliente AND libro_autor.id_libro_fk=libro.id_ISBN AND libro_autor.id_autor_fk=autor.aut_codigo AND libro.id_editorial_fk=editorial.id_editorial)
ORDER BY compra.id_compra;
