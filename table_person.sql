CREATE TABLE `test`.`person` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `birth_date` DATE NULL,
  `pesel` CHAR(11) NULL,
  PRIMARY KEY (`id`));