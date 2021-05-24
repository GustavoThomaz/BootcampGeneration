 CREATE DATABASE db_farmacia_do_bem;
 
 USE db_farmacia_do_bem;
 
 CREATE TABLE  tb_categoria (
	id_categoria BIGINT NOT NULL AUTO_INCREMENT,
	nome_da_categoria VARCHAR (255) NOT NULL,
    descricao_categoria VARCHAR (255) NOT NULL,
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
	id_produto BIGINT NOT NULL AUTO_INCREMENT,
	nome_do_produto VARCHAR (255) NOT NULL,
    preco INT NOT NULL,
    possui_desconto BOOLEAN NOT NULL,
    fk_categoria BIGINT,
    
	PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome_da_categoria, descricao_categoria) VALUE 
	("Remédio comprimido","Remédios em capsulas"),
    ("Remédio em gota","Remédios líquidos"),
    ("Produtos infantil","Produtos para cuidado infantil"),
    ("Produtos de higiene pessoal", "Produtos para higiene pessoal"),
    ("Cuidado pessoal", "Produtos para cuidade pessoal");
    
INSERT INTO tb_produto (nome_do_produto, preco, possui_desconto, fk_categoria) VALUE
	("Omeprazol", 21 ,FALSE,1),
    ("Doralgina",8,TRUE,1),
    ("Dipirona", 14, FALSE, 2),
    ("Dramim",12, FALSE,2),
    ("Fralda", 61,TRUE,3),
    ("Creme dental", 5, FALSE, 4),
    ("Shampoo", 21,FALSE, 5),
    ("Condicionador", 15, FALSE, 5);
    
SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome_do_produto LIKE "%B%";

SELECT * FROM tb_produto
	INNER JOIN tb_categoria ON fk_categoria = tb_categoria.id_categoria;
    
SELECT * FROM tb_produto
	INNER JOIN tb_categoria ON fk_categoria = tb_categoria.id_categoria
		WHERE fk_categoria = 4;