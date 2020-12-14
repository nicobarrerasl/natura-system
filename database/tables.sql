CREATE TABLE IF NOT EXISTS Cliente (
  codCliente 			    SMALLSERIAL 	UNIQUE, 
  cliente_apellido 		  	VARCHAR(30) 	NOT NULL, 
  cliente_nombre 		    VARCHAR(50) 	NOT NULL,
  cliente_Fnac			    VARCHAR(12)		DEFAULT NULL,
  cliente_tel        		VARCHAR(15)     NOT NULL, 
  cliente_DV 				VARCHAR(50) 	NOT NULL, 
  cliente_ZV				VARCHAR(50) 	NOT NULL,
  cliente_saldo         	decimal(10,2)   DEFAULT 0.00,
  status                	SMALLINT        DEFAULT 1,

  PRIMARY KEY (codCliente)
);

CREATE TABLE IF NOT EXISTS Pago (
  codPago			    SMALLSERIAL 	UNIQUE,
  pago_fecha			VARCHAR(12)		NOT NULL,
  pago_saldo			Decimal(10,2)	NOT NULL,
  codCliente			SMALLINT		NOT NULL,
  status                SMALLINT        DEFAULT 1,
  FOREIGN KEY (codCliente) REFERENCES Cliente(codCliente),
  PRIMARY KEY (codPago)
);


CREATE TABLE IF NOT EXISTS Compra (
  codCompra			    SMALLSERIAL 	UNIQUE,
  compra_fecha			VARCHAR(12)		NOT NULL,
  compra_saldo			Decimal(10,2)	NOT NULL,
  codCliente			SMALLINT		NOT NULL,
  status                SMALLINT        DEFAULT 1,
  FOREIGN KEY (codCliente) REFERENCES Cliente(codCliente),
  PRIMARY KEY (codCompra)
);

CREATE TABLE IF NOT EXISTS Producto (

  codProducto             INT 		        UNIQUE,
  prod_cat                VARCHAR(30) 		NOT NULL, 
  prod_linea              VARCHAR(30) 		NOT NULL, 
  prod_nombre             VARCHAR(30) 		NOT NULL, 
  prod_precio             decimal(10,2)     NOT NULL, 
  prod_cant               SMALLINT          NOT NULL,
  status                  SMALLINT          DEFAULT 1,
  
  PRIMARY KEY (codProducto)
);

CREATE TABLE IF NOT EXISTS CompraProducto (

  codProducto       INT             NOT NULL,
  codCompra		    INT 	        NOT NULL,
  cantidad          SMALLINT        NOT NULL,
  status            SMALLINT          DEFAULT 1,
  
  FOREIGN KEY (codProducto) REFERENCES Producto(codProducto),
  FOREIGN KEY (codCompra) REFERENCES Compra(codCompra),
  PRIMARY KEY (codCompra,codProducto)
);

CREATE TABLE IF NOT EXISTS Pedido (

  codPedido               SMALLSERIAL 		UNIQUE,
  pedido_f		          VARCHAR(12)		DEFAULT NULL,
  pedido_imp              decimal(10,2)     NOT NULL,
  pedido_estado           VARCHAR(30) 		NOT NULL, 
  pedido_cantFallos       SMALLINT          NOT NULL,
  status                  SMALLINT          DEFAULT 1,  

  PRIMARY KEY (codPedido)
);

CREATE TABLE IF NOT EXISTS Promocion (

  codPromocion            SMALLSERIAL		UNIQUE,
  prom_precio             decimal(10,2)     NOT NULL,
  prom_desc               decimal(10,2)     NOT NULL,
  status                  SMALLINT          DEFAULT 1,
  
  PRIMARY KEY (codPromocion)
);