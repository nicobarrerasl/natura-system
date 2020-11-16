INSERT INTO 
    Cliente(cliente_apellido, cliente_nombre, cliente_Fnac, cliente_tel,cliente_DV,cliente_ZV) 
VALUES ('Barrera', 'Nicolas', '1995-05-23', '266-5033303', 'Sarmiento 790', 'Centro'),
       ('Pergolini', 'Franco', '1994-04-12', '265-7033303', 'Sarmiento 23', 'Centro'),
       ('Perez', 'Ester', '1970-05-23', '266-4033303', 'Rivad. 123', 'Centro'),
       ('Barroso', 'Jorge', '1998-05-23', '266-4333303', 'Colon 20', 'Centro')

INSERT INTO 
    Producto(codProducto, prod_cat, prod_linea, prod_nombre, prod_precio, prod_cant) 
VALUES (755895, 'MAMA y BEBE', 'TODO DIA', 'KAIAK', 999.1, 5),
       (945895, 'HOMBRE', 'VER PARA CREER', 'BODY SPLASH', 559.9, 10),
       (545854, 'MUJER', 'CREMAS', 'MANUSA', 1500, 7),
       (122357, 'MUJER', 'EKOS', 'ESSENSIAL', 230.5, 2)

select * from cliente