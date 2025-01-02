CREATE TABLE topicos (
	id bigint not null auto_increment,
	titulo varchar(100) not null unique,
	mensaje varchar(100) not null unique,
	fecha_creacion DATETIME NOT NULL,
--	fecha varchar(100) not null,
	estatus tinyint,
	autor varchar(100) not null,
	curso varchar(100) not null,

	primary key(id)
)
