CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE produtos (
	nome VARCHAR (255) NOT NULL, 
    id INT NOT NULL AUTO_INCREMENT, 
    valor FLOAT (10,2) NOT NULL,
    categoria_produto VARCHAR (255),
    quantidade INT NOT NULL,
    PRIMARY KEY (id)
); 

INSERT INTO produtos (nome, valor, categoria_produto, quantidade) VALUE 
	("camisa", 20.00, "Vestuário",3),
    ("Notebook", 3500.00, "Eletrônicos", 2),
    ("Cubo mágico", 22.23, "Brinquedos", 5),
    ("Bola de futebol", 180.00, "Brinquedos", 14),
    ("Chocolate", 5.00, "Alimento",12);
    
SELECT * FROM produtos 
	WHERE valor > 500; 

SELECT * FROM produtos
	WHERE valor < 500;

SET SQL_SAFE_UPDATES = 0;
UPDATE produtos SET quantidade = 15 WHERE nome = "Notebook";
    
