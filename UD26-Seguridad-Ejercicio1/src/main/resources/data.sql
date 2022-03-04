
DROP table IF EXISTS suministra;
DROP table IF EXISTS proveedores;
DROP table IF EXISTS piezas;
DROP table IF EXISTS usuario;

create table piezas(
	Id int auto_increment,
	Nombre nvarchar(100),
	PRIMARY KEY (id)
);

create TABLE proveedores(
	Id char(4),
	Nombre nvarchar(100),
	PRIMARY KEY (id)
);

create table suministra(
	Id int auto_increment,
	CodigoPieza int,
	IdProveedor char(4),
	Precio int,
	PRIMARY KEY (id),
    KEY CodigoPieza_idx (CodigoPieza),
    CONSTRAINT CodigoPieza_idx FOREIGN KEY (CodigoPieza) REFERENCES piezas (Id),
    KEY IdProveedor_idx (IdProveedor),
    CONSTRAINT IdProveedor_idx FOREIGN KEY (IdProveedor) REFERENCES proveedores (Id)
);

CREATE TABLE `usuario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `piezas_proveedores`.`piezas` (`Id`, `Nombre`) VALUES (1, "Procesador");
INSERT INTO `piezas_proveedores`.`proveedores` (`Id`, `Nombre`) VALUES ("abcd", "Intel");
INSERT INTO `piezas_proveedores`.`suministra` (`Id`, `CodigoPieza`, `IdProveedor`, `Precio`) VALUES (1, 1, "abcd", 350);
INSERT INTO `piezas_proveedores`.`usuario` (`username`, `password`, `role`) VALUES ('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','admin');