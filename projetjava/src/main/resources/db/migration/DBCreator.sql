CREATE DATABASE phpprojet DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE phpprojet;

CREATE TABLE Telephone(
    id INTEGER PRIMARY KEY NOT NULL,
    marque VARCHAR(50) NOT NULL,
    modele VARCHAR(15) NOT NULL,
    capacite INTEGER NOT NULL
)ENGINE=INNODB;

