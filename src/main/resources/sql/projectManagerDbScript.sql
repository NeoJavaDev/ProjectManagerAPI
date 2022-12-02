-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema project_manager
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema project_manager
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `project_manager` DEFAULT CHARACTER SET utf8 ;
USE `project_manager` ;

-- -----------------------------------------------------
-- Table `project_manager`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project_manager`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `surname` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `email` VARCHAR(100) NULL,
  `nationality` VARCHAR(100) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `project_manager`.`project`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `project_manager`.`project` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `start_date` DATE NULL,
  `end_date` DATE NULL,
  `hr` INT NULL,
  `software` INT NULL,
  `hardware` INT NULL,
  `distribution` INT NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
  INDEX `fk_project_user_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `fk_project_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `project_manager`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
