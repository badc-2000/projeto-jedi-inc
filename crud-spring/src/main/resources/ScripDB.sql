-- Apagar o db de dados
drop database db;
-- Criar o banco de dados
create database db;
-- Atribuir os privilégios de acesso aos objetos do banco
-- para o usuário root
GRANT ALL PRIVILEGES ON db.* TO 'root' @'localhost';
-- Acesar o banco de dados: banco
USE db;
-- Criar a tabela: projetos
CREATE TABLE projetos(
    id int AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    startDate DATE,
    endDate DATE,
    projectValue int NOT NULL,
    risk int NOT NULL,
    PRIMARY KEY (id)
);