CREATE DATABASE db_estoque; -- cria o banco de dados

USE db_estoque; -- utiliza o banco de dados criado

CREATE TABLE tb_marcas( -- cria a tabela marcas e determina os parâmetros
id BIGINT(5) AUTO_INCREMENT,
nome VARCHAR(20) NOT NULL,
ATIVO BOOLEAN,
PRIMARY KEY (id)
);

INSERT INTO tb_marcas(nome,ativo) VALUES -- popula a tabela
("NIKE",true);

SELECT * FROM tb_marcas; -- visualiza todos os dados da tabela

INSERT INTO tb_marcas(nome,ativo) VALUES
("fatal Surf", false);

-- ALGUMAS FUNCIONALIDADES 
UPDATE tb_marcas SET nome = "Fatal Surf", ativo = true -- atualiza os dados da tabela
WHERE id = 2;  -- onde o id é igual a 2

SELECT * FROM tb_marcas where id >= 2;-- seleciona a tabela onde o id é maior ou igual a 2
-- existem operadores lógicos <> diferente, >= maior ou igual, <= menor ou igual

SELECT nome, ativo from tb_marcas; -- só mostra as colunas nome e ativo

DELETE FROM tb_marcas where id = 1; -- apaga um dado especifico da tabela 

INSERT INTO tb_marcas (nome, ativo) VALUES
("Nike", true),
("H&M", true),
("Zara", true),
("Louis Vuitton", true),
("Adidas",true),
("Uniqlo", true),
("Hermès", true),
("Rolex", true),
("Gucci", true),
("Cartier", true);

SELECT * FROM tb_marcas;

SELECT * FROM tb_marcas where nome LIKE "%fa%"; -- traz todos que  contém fa

USE db_estoque;

CREATE TABLE tb_produtos (
id BIGINT AUTO_INCREMENT,
nome VARCHAR(30) NOT NULL,
preco DECIMAL(10,2),
marca_id BIGINT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (marca_id) references tb_marcas (id) -- Definir coluna id como chave estrangeira e referenciando a tb_marcas coluna id
);

INSERT INTO tb_produtos (nome, preco, marca_id) VALUES
("Camisa", 22.99, 1); -- não existe mais a chave 1 pois foi deletada

INSERT INTO tb_produtos (nome, preco, marca_id) VALUES
("Camisa", 22.99, 3);

INSERT INTO tb_produtos (nome, preco, marca_id) VALUES
("tenis", 69.99, 3);

SELECT *FROM tb_produtos;

INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","60.53",11);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Camisa","58.18",9);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","83.50",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","92.81",3);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","76.95",9);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","96.56",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","61.16",8);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","73.08",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","53.45",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Camisa","56.92",3);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","81.02",9);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","90.09",11);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","55.73",9);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","09.46",10);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","60.61",10);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","71.91",7);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","54.90",7);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","13.16",8);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","80.22",3);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","84.27",7);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","87.11",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Camisa","35.96",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","23.16",11);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","77.88",3);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","83.63",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","68.98",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","18.33",8);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","43.75",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","96.40",5);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","59.48",5);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","19.44",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","32.70",5);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","53.47",2);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","68.23",9);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","45.82",8);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","17.42",3);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","76.39",7);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","01.88",8);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","69.80",10);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","80.52",2);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","86.33",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","61.78",10);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","28.29",8);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","57.99",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Camisa","55.48",9);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","84.55",2);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Camisa","68.45",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","64.03",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","37.26",5);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","54.97",9);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","60.05",11);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","02.20",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","62.34",8);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Camisa","27.78",2);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","09.43",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","59.28",7);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Camisa","32.32",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","33.27",3);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","58.83",10);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","93.27",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","46.21",2);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","10.77",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","74.52",5);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","83.68",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","30.63",2);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","91.49",2);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Camisa","01.56",10);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","45.30",3);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","97.40",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","25.18",2);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","70.40",3);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Camisa","20.94",10);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","89.31",3);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","46.78",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","88.83",8);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","61.93",2);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","29.27",11);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","92.18",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","10.19",2);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","00.46",7);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","69.06",2);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","93.42",10);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","50.73",12);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","94.94",9);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","70.78",7);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","87.82",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","01.51",11);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","78.71",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Meias","77.15",10);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","64.60",6);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Tênis","53.82",12);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","66.17",5);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","51.72",8);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","90.24",12);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","31.67",4);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","07.12",12);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","56.89",12);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","77.37",5);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Blusa","81.72",7);
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Calça","66.29",6);

DELETE FROM tb_produtos where id = 2; -- apaga um dado especifico da tabela 

SELECT * FROM tb_produtos
	INNER JOIN tb_marcas ON tb_marcas.id = tb_produtos.marca_id;