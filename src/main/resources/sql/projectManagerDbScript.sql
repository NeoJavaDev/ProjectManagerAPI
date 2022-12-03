-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema project_manager_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `project_manager_db` DEFAULT CHARACTER SET utf8 ;
USE `project_manager_db` ;

-- -----------------------------------------------------
-- Table `project_manager_db`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project_manager_db`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `surname` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `nationality` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `project_manager_db`.`project`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project_manager_db`.`project` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `start_date` DATE NOT NULL,
  `end_date` DATE NOT NULL,
  `logo_url` VARCHAR(100) NULL,
  `user_id_fk` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
  INDEX `fk_project_user_idx` (`user_id_fk` ASC) VISIBLE,
  CONSTRAINT `fk_project_user`
    FOREIGN KEY (`user_id_fk`)
    REFERENCES `project_manager_db`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `project_manager_db`.`task`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project_manager_db`.`task` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `management` INT NULL DEFAULT NULL,
  `developer` INT NULL DEFAULT NULL,
  `software` INT NULL DEFAULT NULL,
  `hardware` INT NULL DEFAULT NULL,
  `premises` INT NULL DEFAULT NULL,
  `furniture` INT NULL DEFAULT NULL,
  `sourcing` INT NULL DEFAULT NULL,
  `distribution` INT NULL DEFAULT NULL,
  `revenue` INT NULL DEFAULT NULL,
  `logo_url` VARCHAR(100) NULL,
  `project_id_fk` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
  INDEX `fk_task_project1_idx` (`project_id_fk` ASC) VISIBLE,
  CONSTRAINT `fk_task_project1`
    FOREIGN KEY (`project_id_fk`)
    REFERENCES `project_manager_db`.`project` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
