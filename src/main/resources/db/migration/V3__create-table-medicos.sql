CREATE TABLE medicos(
    
    id bigint NOT NULL auto_increment,
    nombre varchar(100) NOT NULL,
    email varchar(100) NOT NULL UNIQUE,
    documento varchar(12) NOT NULL UNIQUE,
    especialidad varchar(100) NOT NULL,
    calle varchar(100) NOT NULL,
    barrio varchar(100) NOT NULL,
    codigo_postal varchar(12) NOT NULL,
    complemento varchar(100),
    numero varchar(20),
    estado char(100) NOT NULL,
    ciudad varchar(100) NOT NULL,

    PRIMARY KEY(id)
);