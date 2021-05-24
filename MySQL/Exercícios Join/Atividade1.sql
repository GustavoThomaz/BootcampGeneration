CREATE DATABASE db_generation_game_online; 

USE db_generation_game_online;

CREATE TABLE  tb_classe (
	id_classe BIGINT NOT NULL AUTO_INCREMENT,
	nome_da_classe VARCHAR (255) NOT NULL,
    descricao_classe VARCHAR (255) NOT NULL,
    PRIMARY KEY (id_classe)
);

CREATE TABLE tb_personagem (
	id_personagem BIGINT NOT NULL AUTO_INCREMENT,
	nome_personagem VARCHAR (255) NOT NULL,
    poder_ataque INT NOT NULL,
    poder_defesa INT NOT NULL,
    fk_classe BIGINT,
    
	PRIMARY KEY (id_personagem),
    FOREIGN KEY (fk_classe) REFERENCES tb_classe(id_classe)
);

INSERT INTO tb_classe (nome_da_classe, descricao_classe) VALUE 
	("Assasino","Tem como habilidade principal a mobilidade e força no ataque"),
    ("Mago","Podem lançar feitiços"),
    ("Lutador", "Atuam bem tanto no ataque quanto na defesa e seus ataques são a curtas distâncias"),
    ("Atirador", "Possuem ataques fortes e tem como característica atacar de longe"),
    ("Controladores", "Lançam ferramentas de proteção e apoio bastante úteis ao time");
    
INSERT INTO tb_personagem (nome_personagem, poder_ataque, poder_defesa, fk_classe) VALUE
	("Zed", 8000, 7500,1),
    ("Fizz",7900,8500,1),
    ("Annie", 5889, 5800, 2),
    ("Lissandra", 1454, 1569,2),
    ("Garen", 1286,4180,3),
    ("Corki", 1890, 1257, 4),
    ("Graves", 8105, 5455, 4),
    ("Bard", 1450, 1659, 5);
    
SELECT * FROM tb_personagem WHERE poder_ataque > 2000;
SELECT * FROM tb_personagem WHERE poder_defesa BETWEEN 1000 AND 2000;
SELECT nome_personagem, poder_ataque, poder_defesa FROM tb_personagem WHERE nome_personagem LIKE "%c%";

SELECT * FROM tb_personagem 
	INNER JOIN tb_classe ON fk_classe = tb_classe.id_classe;
    
SELECT nome_personagem, poder_ataque, poder_defesa FROM tb_personagem
	INNER JOIN tb_classe ON fk_classe = tb_classe.id_classe
		WHERE fk_classe = 2;
