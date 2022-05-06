CREATE DATABASE concessionaria;
USE concessionaria;

CREATE TABLE Veiculo(
	chassi VARCHAR(17)  NOT NULL PRIMARY KEY UNIQUE,
	marca VARCHAR(10) NULL,
	modelo VARCHAR(20) NULL,
	anoFabricacao INT NOT NULL,
	anoModelo INT NOT NULL,
	combustivel CHAR(1)
);

ALTER TABLE Veiculo ADD
	valor DECIMAL(7,2) NOT NULL,
	motor VARCHAR(20) NOT NULL;
	
ALTER TABLE Veiculo DROP COLUMN motor;

CREATE INDEX tipoCarro
	ON Veiculo(marca ASC, modelo ASC);

CREATE INDEX indexAnoFabricacao
	ON Veiculo(anoFabricacao DESC);
	
DROP INDEX tipoCarro
	ON Veiculo;
	
DROP TABLE Veiculo;

DROP DATABASE concessionaria;
