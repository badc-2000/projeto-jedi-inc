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
    startDate DATE NOT NULL DEFAULT CURRENT_DATE,
    endDate DATE NOT NULL DEFAULT CURRENT_DATE,
    projectValue int(20) NOT NULL DEFAULT 0,
    risk int(1) NOT NULL DEFAULT 0,
    PRIMARY KEY (id)
);