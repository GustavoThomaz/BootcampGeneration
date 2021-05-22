CREATE DATABASE empresa_RH;
 
USE empresa_RH;

CREATE TABLE funcionaries (
	nome_funcionarie VARCHAR (255) NOT NULL,
	id_funcionarie INT NOT NULL AUTO_INCREMENT,
    salario FLOAT (10,2) NOT NULL,
    idade INT NOT NULL,
    cargo VARCHAR (255) NOT NULL,
    PRIMARY KEY (id_funcionarie)
);

INSERT INTO funcionaries (nome_funcionarie, salario, idade, cargo) VALUE 
	("Ester", 1500.00, 18, "Médica"),
    ("Gustavo", 15000.00, 19, "Diretor de Projetos"),
    ("Maria", 6000.00,38, "Analista Fiscal"),
    ("Anderson", 2500.00,43, "Cozinheiro"),
    ("Rafael", 1800.00, 18, " Técnico em eletrônica");
    
SELECT * FROM funcionaries 
	WHERE salario > 2000; 
    
SELECT * FROM funcionaries 
	WHERE salario < 2000; 

SET SQL_SAFE_UPDATES=0;
UPDATE funcionaries SET salario = salario + 8000.00 WHERE nome_funcionarie = "Ester";
    