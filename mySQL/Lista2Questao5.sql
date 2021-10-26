CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria (
	id_categoria INT AUTO_INCREMENT,
    tipo ENUM ('Hidraúlica','Elétrica'),
    prazo_entrega INT NOT NULL,
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
	id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL,
    marca VARCHAR(255) NOT NULL,
	valor DOUBLE NOT NULL,
    fk_id_categoria INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)
    );
    
INSERT INTO tb_categoria (tipo, prazo_entrega) VALUES
("Hidraúlica",10),
("Elétrica", 15),
("Elétrica",20),
("Hidraúlica",25),
("Elétrica",30);

SELECT * FROM tb_categoria;

INSERT INTO tb_produto(nome, quantidade, marca, valor, fk_id_categoria) VALUES
("Joelho", 3, "Krona", 20.90,1),
("torneira cromada", 1, "Trigre", 120.89,4),
("Interruptor", 5, "Cliclone", 40.75,3),
("quadro de distribuição", 4, "Luxluz", 280.99,5),
("Lampada", 10, "celpe", 12.00,5),
("cano pvc", 12, "amanco", 80.90,4),
("ralo de banheiro", 3, "BrunaLTDA", 4.99,1),
("cotovelo", 10, "BarbaraS.A", 15.75,1);

SELECT * FROM tb_produto;

SELECT * FROM tb_produto WHERE valor > 50.00;

SELECT * FROM tb_produto WHERE valor BETWEEN 3.00 AND 60.00;

SELECT * FROM tb_produto WHERE nome LIKE 'c%';

SELECT * FROM tb_categoria
INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria;

SELECT * FROM tb_categoria
INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.tipo = 'Hidraúlica';