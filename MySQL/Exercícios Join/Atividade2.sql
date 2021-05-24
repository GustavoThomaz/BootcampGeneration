CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE  tb_categoria (
	id_categoria BIGINT NOT NULL AUTO_INCREMENT,
	nome_da_categoria VARCHAR (255) NOT NULL,
    descricao_categoria VARCHAR (255) NOT NULL,
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_pizza (
	id_pizza BIGINT NOT NULL AUTO_INCREMENT,
	nome_da_pizza VARCHAR (255) NOT NULL,
    preco INT NOT NULL,
    ingredientes VARCHAR(255) NOT NULL,
    fk_categoria BIGINT,
    
	PRIMARY KEY (id_pizza),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome_da_categoria, descricao_categoria) VALUE 
	("Salgada pequena","Pizza de 25 centímetro de diâmetro com recheio salgado."),
    ("Doce pequena","Pizza de 25 centímetro de diâmetro com recheio doce."),
    ("Salgada média","Pizza de 35 centímetro de diâmetro com recheio salgado."),
    ("Doce média", "Pizza de 35 centímetro de diâmetro com recheio doce."),
    ("Salgada grande", "Pizza de 45 cm de diâmetro com recheio salgado.");
    
INSERT INTO tb_pizza (nome_da_pizza, preco, ingredientes, fk_categoria) VALUE
	("Portuguesa", 45 , "Contém presunto, mussarela, ervilha, cebola e molho de tomate.",3),
    ("Atum com mussarela",52,"Contém atum fresco, mussarela, molho de tomate e cebola.",3),
    ("M&M", 35, "Contém chocolate derretido e M&Ms.", 2),
    ("Chocolate com morango",43, "Contém chocolate derretido com pedaços de morango.",4),
    ("Mussarela", 28,"Contém mussarela com rodelas de tomate e molho de tomate.",1),
    ("Calabresa", 28, "Contém calabresa, molho de tomate e cebola.", 1),
    ("Atum com mussarela", 65,"Contém presunto, mussarela, ervilha, cebola e molho de tomate.", 5),
    ("Toscana", 61, "Contém calabresa moída, molho de tomate e mussarela.", 5);
    
SELECT * FROM tb_pizza WHERE preco > 45;
SELECT * FROM tb_pizza WHERE preco BETWEEN 29 AND 60;
SELECT * FROM tb_pizza WHERE nome_da_pizza LIKE "%c%";

SELECT * FROM tb_pizza
	INNER JOIN tb_categoria ON fk_categoria = tb_categoria.id_categoria;
    
SELECT * FROM tb_pizza
	INNER JOIN tb_categoria ON fk_categoria = tb_categoria.id_categoria
		WHERE fk_categoria = 5;