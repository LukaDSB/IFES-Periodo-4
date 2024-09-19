------ criação da tebela teste ------
CREATE TABLE `testedb`.`teste` (
  `idTeste` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(100) NOT NULL,
  `login` VARCHAR(45) NULL,
  `senha` VARCHAR(512) NULL,
  PRIMARY KEY (`idTeste`),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

------criação do banco loja ------
CREATE SCHEMA `loja` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `loja`.`tipo_usuario` (
  `idtipo_usuario` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(100) NOT NULL,tipo_usuario
  PRIMARY KEY (`idtipo_usuario`),
  UNIQUE INDEX `descricao_UNIQUE` (`descricao` ASC) VISIBLE);

SELECT * FROM loja.tipo_usuario;

SELECT c.Name from world.city c LIMIT 100


------criação do banco fruto e fruta ------
CREATE SCHEMA `frutoefruta` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `frutoefruta`.`receita` (
  `idreceita` INT NOT NULL AUTO_INCREMENT,
  `nomereceita` VARCHAR(100) NOT NULL,
  `descricao` VARCHAR(200) NULL,
  PRIMARY KEY (`idreceita`));
  
  
------criação da tabela tiporeceita ------
  CREATE TABLE `frutoefruta`.`tipodereceita` (
  `idreceita` INT NOT NULL,
  `tiporeceita` VARCHAR(100) NULL,
  PRIMARY KEY (`idreceita`));
