CREATE DATABASE db_rh;

USE db_rh;
CREATE TABLE tb_funcionarios(
	id_funcionario INT AUTO_INCREMENT,
    nome VARCHAR(255),
    email VARCHAR(255),
    cargo VARCHAR(255),
    salario DOUBLE NULL,
    PRIMARY KEY(id_funcionario)
);

INSERT INTO tb_funcionarios (nome,email,cargo,salario) VALUES 
("Arthur","arthur@hotmail.com","Diretor",10000.00),
("Alyson","alyson@hotmail.com","Consultor",1000.00),
("Amancio","amancio@hotmail.com","Designer",5000.00),
("Bruna","bruna@hotmail.com","Conselheira",12000.00),
("Fernanda","fernanda@hotmail.com","Diretora de Eventos",12000.00);

SELECT * FROM tb_funcionarios salario WHERE salario>2000;

SELECT * FROM tb_funcionarios salario WHERE salario<2000;

USE db_rh;

UPDATE tb_funcionarios SET salario = 1100.00 where id_funcionario = 2; 