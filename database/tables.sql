CREATE TABLE IF NOT EXISTS Cliente (
	
  codCliente			SMALLSERIAL 		UNIQUE, --
  cliente_apellido 		VARCHAR(30) 		NOT NULL, --
  cliente_nombre 		VARCHAR(50) 		NOT NULL, --
  cliente_edad 			INT 				DEFAULT NULL,
  cliente_Fnac			VARCHAR(12)			NOT NULL,
  cliente_tel        	VARCHAR(11)         NOT NULL,       --
  cliente_DV 			VARCHAR(50) 		DEFAULT NULL, -- Direccion Vivienda
  cliente_ZV			VARCHAR(50) 		DEFAULT NULL, -- Zona Vivienda
  cliente_DT 			VARCHAR(50) 		DEFAULT NULL, -- Direccion de Trabajo
  cliente_ZT 			VARCHAR(50) 		DEFAULT NULL, -- Zona de Trabajo
  cliente_ocup 			VARCHAR(50) 		DEFAULT NULL, -- Zona de Trabajo
  cliente_saldo			decimal(10,2)		DEFAULT 0, -- Saldo que debe
  status                SMALLINT            DEFAULT 1,

  PRIMARY KEY (codCliente)
);

CREATE TABLE IF NOT EXISTS Producto (

  codProducto           INT 				UNIQUE,
  prod_cat              VARCHAR(30) 		NOT NULL, 
  prod_linea            VARCHAR(30) 		NOT NULL, 
  prod_nombre           VARCHAR(30) 		NOT NULL, 
  prod_precio           decimal(10,2)    	NOT NULL, 
  prod_desc             decimal(10,2)     	DEFAULT 0, 
  prod_cant             SMALLINT          	NOT NULL,
  
  PRIMARY KEY (codProducto)
);

CREATE TABLE IF NOT EXISTS Compra (

  codCompra             INT 				UNIQUE,
  compra_fecha          VARCHAR(12) 		NOT NULL, 
  compra_saldo          VARCHAR(30) 		NOT NULL, 
  codCliente			SMALLSERIAL			NOT NULL,

  FOREIGN KEY (codCliente) from Cliente(codCliente),
  PRIMARY KEY (codCompra)
);