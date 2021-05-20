CREATE DATABASE registro_alunos;

USE registro_alunos;

CREATE TABLE alunes (
	nome VARCHAR (255) NOT NULL,
    ra INT NOT NULL AUTO_INCREMENT,
    idade INT NOT NULL,
    nota FLOAT (10,1) DEFAULT 0,
    turma VARCHAR(255) NOT NULL,
    PRIMARY KEY (ra)
  );
  
INSERT INTO alunes (nome, idade,turma) VALUE 
   ("Gustavo", 19.0, "22"),
   ("Giullia", 35.0,"22"),
   ("Ester", 12.0, "2"),
   ("Rafael",18.0, "312"),
   ("Maria",38.0, "5");
   
SET SQL_SAFE_UPDATES = 0;
UPDATE alunes SET nota = 10.0 WHERE nome = "Gustavo";

UPDATE alunes SET nota = 8 WHERE nome = "Ester";

SELECT * FROM alunes WHERE
	nota > 7;
    
SELECT * FROM alunes WHERE
	nota < 7;