CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria (
	id_categoria INT AUTO_INCREMENT,
    curso ENUM ('Java','Javascript', 'Python', 'Banco de Dados'),
    turno VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_curso (
	id_curso INT AUTO_INCREMENT,
    nome_aluno VARCHAR(255) NOT NULL,
    professor ENUM ('Boaz','Fernanda'),
    idade INT NOT NULL,
	valor DOUBLE NOT NULL,
    fk_categoria INT,
    PRIMARY KEY (id_curso),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id_categoria)
    );
    
INSERT INTO tb_categoria (curso, turno) VALUES
("Java", "Manhã"),
("Banco de Dados", "Tarde"),
("Javascript", "Noite"),
("Python", "Manhã"),
("Java", "Noite");

SELECT * FROM tb_categoria;

INSERT INTO tb_curso (nome_aluno, professor, idade, valor, fk_categoria) VALUES
("Bruna", 'Boaz', 27, 300.00, 1),
("Bárbara", 'Fernanda', 28, 500.00, 4),
("Ályson", 'Fernanda', 30, 700.00, 4),
("Danillo", 'Fernanda', 20.00, 22,3),
("Julia", 'Boaz', 90.80, 25,2),
("Marília", 'Boaz', 50.60, 20,5),
("Arthur", 'Boaz', 300.00, 21,1),
("Sylvia", 'Boaz', 500.00, 26,2);

SELECT * FROM tb_curso;

SELECT * FROM tb_curso WHERE valor > 50.00;

SELECT * FROM tb_curso WHERE valor BETWEEN 3.00 AND 60.00;

SELECT * FROM tb_curso WHERE nome_aluno LIKE 'j%';

SELECT * FROM tb_categoria
INNER JOIN tb_curso
ON tb_curso.fk_categoria = tb_categoria.id_categoria;

SELECT * FROM tb_categoria
INNER JOIN tb_curso
ON tb_curso.fk_categoria = tb_categoria.id_categoria
WHERE tb_categoria.turno = 'Noite';