 CREATE DATABASE db_construindo_a_nossa_vida;
 
 USE db_construindo_a_nossa_vida;
 
 CREATE TABLE  tb_categoria (
	id_categoria BIGINT NOT NULL AUTO_INCREMENT,
	nome_da_categoria VARCHAR (255) NOT NULL,
    descricao_categoria VARCHAR (255) NOT NULL,
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
	id_produto BIGINT NOT NULL AUTO_INCREMENT,
	nome_do_produto VARCHAR (255) NOT NULL,
    preco FLOAT NOT NULL,
    disponibilidade_estoque BOOLEAN NOT NULL,
    fk_categoria BIGINT,
    
	PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome_da_categoria, descricao_categoria) VALUE 
	("Pisos","Revestimento tanto de parede quanto de chão da casa"),
    ("Tintas","Área referente a pintura"),
    ("Elétrica","Fios, cabos e materiais para a parte elétrica"),
    ("Ferramentas", "Máquinas de pintura, de corte de piso, máquinas para a construção no geral"),
    ("Hidráulica", "Canos, juntas. para a construção");
    
INSERT INTO tb_produto (nome_do_produto, preco, disponibilidade_estoque, fk_categoria) VALUE
	("Tinta suvinil branca", 150.0 ,TRUE,2),
    ("Serra Mármore",374.0,TRUE,4),
    ("Verniz pequeno", 28.0, FALSE, 2),
    ("Piso madeirado ",22.90, FALSE,1),
    ("Revestimento azulejo branco", 61.87,TRUE,1),
    ("Fio 10mm", 254.6, FALSE, 3),
    ("Cano de esgoto", 49.54,TRUE, 5),
    ("Cotovelo 3/4", 0.65, FALSE, 5);
    
SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome_do_produto LIKE "%C%";

SELECT * FROM tb_produto
	INNER JOIN tb_categoria ON fk_categoria = tb_categoria.id_categoria;
    
SELECT * FROM tb_produto
	INNER JOIN tb_categoria ON fk_categoria = tb_categoria.id_categoria
		WHERE fk_categoria = 2;