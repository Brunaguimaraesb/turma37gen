CREATE DATABASE db_cidade_das_frutas;

USE db_cidade_das_frutas;

CREATE TABLE tb_categoria (
	id_categoria INT AUTO_INCREMENT,
    tipo ENUM ('Fruta','Verdura'),
    cor VARCHAR(255),
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
	id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL,
    distribuidor VARCHAR(255) NOT NULL,
	valor DOUBLE NOT NULL,
    fk_id_categoria INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)
    );
    
INSERT INTO tb_categoria (tipo, cor) VALUES
("fruta","vermelho"),
("fruta", "verde"),
("verdura","roxo"),
("fruta","laranja"),
("verdura","laranja");

SELECT * FROM tb_categoria;

INSERT INTO tb_produto(nome, quantidade, distribuidor, valor, fk_id_categoria) 
VALUES
("Melancia", 3, "MK-1", 60.90,1),
("Tomate", 10, "Seda", 53.40,5),
("Morango", 5, "Morangos do Campo", 79.80,1),
("Laranja", 4, "HortFrut", 32.80,4),
("Limão", 10, "HortFrut", 30.20,2),
("Beterraba", 12, "kiki", 50.40,3),
("repolho roxo", 3, "repolheira", 12.90,3),
("cenoura", 10, "frutdistribuidora", 10.0,5);

SELECT * FROM tb_produto;

SELECT * FROM tb_produto WHERE valor > 50.00;

SELECT * FROM tb_produto WHERE valor > 3.00 AND valor < 60.00;

SELECT * FROM tb_produto WHERE nome LIKE 'c%';

SELECT * FROM tb_categoria
INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria;

SELECT * FROM tb_categoria
INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.tipo = 'Fruta';