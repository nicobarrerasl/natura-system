INSERT INTO 
    Cliente(cliente_apellido, cliente_nombre, cliente_Fnac, cliente_tel,cliente_DV,cliente_ZV) 
VALUES ('Barrera', 'Nicolas', '1995-05-23', '266-5033303', 'Sarmiento 790', 'Centro'),
       ('Pergolini', 'Franco', '1994-04-12', '265-7032303', 'Sarmiento 23', 'Centro'),
       ('Perez', 'Ester', '1970-10-25', '266-4044312', 'Rivad. 123', 'Sarmiento'),
       ('Barroso', 'Jorge', '1968-11-12', '266-422112', 'Colon 20', 'Estacion'),
       ('Barroso', 'Eduardo', '1978-12-21', '266-872112', 'Rufino 278', 'Estacion'),
       ('Magnago', 'Juan', '1989-01-11', '266-982212', 'Perdernera 222', 'Estacion'),
       ('Perez', 'Graciela', '1999-07-23', '266-921123', 'Colon 503', 'Pablo Juarez'),
       ('Arce', 'Silvia', '1991-12-04', '266-330011', 'Suipacha 393', 'Miranda'),
       ('Barroso', 'Monica', '1992-11-06', '266-992211', 'Pescadorez 110', 'Centro'),
       ('Alvarez', 'Roberto', '1987-10-07', '266-872211', 'Balcance 293', 'Rivera'),
       ('Bitiol', 'Carlos', '1988-08-07', '266-831040', 'General Paz 282', 'Miranda'),
       ('Bossio', 'Gabriel', '1976-06-16', '266-501821', 'San Martin 292', 'Ochoa'),
       ('Crespo', 'Rocio', '1974-11-11', '266-162945', 'Suipacha 2929', 'Pablo Dia'),
       ('Carrizo', 'Hugo', '1970-07-16', '266-822289', 'Italia 928', 'Altos del Oeste'),
       ('Caserez', 'Carmen', '1965-05-19', '266-767821', 'Belgica 212', 'Lafinur'),
       ('Campana', 'Laura', '1968-05-18', '266-788822', 'Europa 2928', 'San Jose'),
       ('Ponzio', 'Matias', '1952-04-20', '266-339911', 'Bolivia 998', 'San Jose'),
       ('Priori', 'Josefina', '1958-03-29', '266-156283', 'Santa Fe 998', 'San Jose'),
       ('Miranda', 'Marina', '1959-01-30', '266-158822', 'Perdernera 888', 'Militar'),
       ('Molina', 'Barbara', '1981-02-10', '266-835023', 'Lavalle 878', 'Oeste')


INSERT INTO 
    Producto(codProducto, prod_cat, prod_linea, prod_nombre, prod_precio, prod_cant) 
VALUES (755295, 'MAMA y BEBE', 'TODO DIA', 'KAIAK', 999.1, 5),
       (245895, 'HOMBRE', 'VER PARA CREER', 'SPLASH', 559.9, 10),
       (545854, 'MUJER', 'CREMAS', 'MANSA', 1500, 7),
       (122357, 'MUJER', 'EKOS', 'ESSENCIAL', 230.5, 2),
       (852823, 'PERFUMERIA', 'MUJER', 'ESSENCIAL', 3300, 4),
       (282833, 'CREMAS', 'HOMBRES', 'URBE', 320, 1),
       (157773, 'MAMA Y BEBE', 'CABELLO', 'SUPREME', 1200.2, 2),
       (722333, 'TODODIA', 'EKOS', 'PECAN', 990, 5),
       (83783,  'CHRONOS', 'MUJER', 'NUEZ', 3110, 5),
       (857823, 'NATURE', 'SHAPOO', 'TOINTOIN', 760.50, 9),
       (45463,  'FOTO EQUILIBRIO', 'FACES', 'IDRATANTE', 557.2, 8),
       (858443, 'CREER PARA VER', 'PLANT', 'ANDIROBA', 1499, 11),
       (83363,  'CREMAS', 'PLANT', 'CASTAÑA', 1700.5, 4),
       (85323,  'IDRATACION Y CUIDADO', 'MUJER', 'CUMARU', 880, 4),
       (823243, 'MAQUILLAJE', 'MUJER', 'MARACUYA', 3499, 10),
       (806183, 'COLONIAS', 'MASCULINO', 'ASAI', 2300, 5)

       
INSERT INTO 
    Compra (compra_fecha,compra_saldo,codCliente)
VALUES ( '2020-11-16','4320.10',  '1'),
       ( '2020-10-16','420.10',  '1')

INSERT INTO 
    CompraProducto (codProducto,codCompra,cantidad)
VALUES  ( '755895','1',  '10'),
        ( '945895','1',  '15'),
        ( '545854','2',  '5'),
        ( '122357','2',  '20')


select * from Cliente

select * from Compra
