CREATE DATABASE RecursosHumanos;
USE RecursosHumanos;

CREATE TABLE Funcionario(
	idFuncionario INT NOT NULL PRIMARY KEY,
	nome VARCHAR(50) NULL,
	endereco VARCHAR(100) NULL,
	cidade VARCHAR(50) NULL,
	estado CHAR(2) NULL,
	dataNascto DATE NULL
);

ALTER TABLE Funcionario ADD
	salario DECIMAL(7,2) NULL FIRST,
	cargo VARCHAR(2) NULL AFTER salario,
	ativo BIT AFTER cargo;/*USAR FIRST NO FINAL E AFTER NOME_COLUNA no final*/
	
INSERT INTO Funcionario 
(idFuncionario,nome,endereco,cidade,estado,email,dataNascto)
VALUES (1,'Carlos Dias','Av. da Lapa, 121','Itu','SP','carlao@gmail.com','1990-03-31');

INSERT INTO Funcionario 
(idFuncionario,nome,endereco,cidade,estado,email,dataNascto)
VALUES (2,'Ivo Cunha','Av. Raio de Luz, 130','Campinas','SP','ivo@bol.com.br','1987-04-11'),
(3,'Carlos Luis de Souza','Rua Nicolau Coelho, 22','Sao Paulo','SP','cls@hotmail.com','1988-04-30');

UPDATE Funcionario SET
	cidade='Valinhos'
	WHERE cidade='itu';
	
UPDATE Funcionario SET
	cargo='AI',
	salario=1100,
	WHERE cidade='Valinhos',
	cargo='PC',
	salario=1700,
	WHERE cidade='Campinas';

DROP DATABASE RecursosHumanos;
