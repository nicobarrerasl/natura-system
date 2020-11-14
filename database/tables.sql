CREATE TABLE IF NOT EXISTS Cliente (
  codCliente 			      SMALLSERIAL 		UNIQUE, --
  cliente_apellido 		  VARCHAR(30) 		NOT NULL, --
  cliente_nombre 		    VARCHAR(50) 		NOT NULL, --
  cliente_edad 			    INT 				DEFAULT NULL,
  cliente_Fnac			    VARCHAR(12)			DEFAULT CURRENT_DATE,
  cliente_tel        		VARCHAR(15)         NOT NULL, --
  cliente_DV 				    VARCHAR(50) 		NOT NULL, -- Direccion Vivienda
  cliente_ZV				    VARCHAR(50) 		NOT NULL, -- Zona Vivienda
  cliente_DT 				    VARCHAR(50) 		DEFAULT NULL, -- Direccion de Trabajo
  cliente_ZT 				    VARCHAR(50) 		DEFAULT NULL, -- Zona de Trabajo
  cliente_ocup 			    VARCHAR(50) 		DEFAULT NULL, -- Zona de Trabajo
  cliente_saldo         decimal(10,2)       DEFAULT 0.00,
  status                SMALLINT            DEFAULT 1,
  PRIMARY KEY (codCliente)
);

CREATE TABLE IF NOT EXISTS Producto (

  codProducto             SMALLSERIAL 		UNIQUE,
  prod_cat                VARCHAR(30) 		NOT NULL, 
  prod_linea              VARCHAR(30) 		NOT NULL, 
  prod_nombre             VARCHAR(30) 		NOT NULL, 
  prod_precio             decimal(10,2)     NOT NULL, 
  prod_desc               decimal(10,2)     NOT NULL, 
  prod_cant               SMALLINT          NOT NULL,
  status                  SMALLINT            DEFAULT 1,
  
  PRIMARY KEY (codProducto)
);

CREATE TABLE IF NOT EXISTS Pedido (

  codPedido               SMALLSERIAL 		UNIQUE,
  pedido_f		            VARCHAR(12)		DEFAULT NULL,
  pedido_imp              decimal(10,2)     NOT NULL,
  pedido_estado           VARCHAR(30) 		NOT NULL, 
  pedido_cantFallos       SMALLINT          NOT NULL,
  status                  SMALLINT            DEFAULT 1,  

  PRIMARY KEY (codPedido)
);

CREATE TABLE IF NOT EXISTS Promocion (

  codPromocion            SMALLSERIAL		UNIQUE,
  prom_precio             decimal(10,2)     NOT NULL,
  prom_desc               decimal(10,2)     NOT NULL,
  status                  SMALLINT            DEFAULT 1,
  
  PRIMARY KEY (codPromocion)
);