CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
	id_categoria INT AUTO_INCREMENT,
    tamanho ENUM ('Pequena','Média','Grande'),
    tipo_massa ENUM ('Tradicional','Fina'),
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_pizza (
	id_pizza INT AUTO_INCREMENT,
    sabor VARCHAR(255) NOT NULL,
    borda ENUM('Catupiry','Cheddar','Sem Borda'),
    recheio_adicional BOOLEAN NOT NULL,
	valor DOUBLE NOT NULL,
    fk_id_categoria INT,
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)
    );
    
INSERT INTO tb_categoria (tamanho, tipo_massa) VALUES
("Pequena", "Fina"),
("Grande", "Tradicional"),
("Média", "Fina"),
("Pequena", "Tradicional"),
("Média", "Tradicional");

SELECT * FROM tb_categoria;

INSERT INTO tb_pizza(sabor, borda, recheio_adicional, valor, fk_id_categoria) VALUES
("Calabresa", "Catupiry", 1, 30.00, 1),
("Nordestina","Cheddar", 0, 45.50, 2),
("Frango e Bacon","Cheddar", 1, 40.80, 4),
("Peperoni","Catupiry", 0, 29.90, 3),
("Cuz cuz", "Cheddar", 1, 12.50, 2),
("Camarão","Catupiry",1,65.00,5),
("Cartola", "Sem Borda", 0, 20.50, 1),
("Romeu e Julieta","Sem Borda",0,50.00,5);

SELECT * FROM tb_pizza;

SELECT * FROM tb_pizza WHERE valor > 45.00;

SELECT * FROM tb_pizza WHERE valor BETWEEN 29.00 AND 60.00;

SELECT * FROM tb_pizza WHERE sabor LIKE 'c%';

SELECT * FROM tb_categoria
INNER JOIN tb_pizza
ON tb_pizza.fk_id_categoria = tb_categoria.id_categoria;

SELECT * FROM tb_categoria
INNER JOIN tb_pizza
ON tb_pizza.fk_id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.tamanho = 'Pequena';
