CREATE DATABASE phpprojet DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE phpProjet;

CREATE TABLE Utilisateur(
    mail VARCHAR(40) PRIMARY KEY NOT NULL,
    prenom VARCHAR(15) NOT NULL,
    nom VARCHAR(15) NOT NULL,
    mdp CHAR(40) NOT NULL,
    fonction INTEGER
)ENGINE=INNODB;

CREATE TABLE Article(
    id VARCHAR(25) PRIMARY KEY NOT NULL,
    nom VARCHAR(15) NOT NULL,
    descr VARCHAR(255),
    prix FLOAT NOT NULL,
    categorie VARCHAR(15)
)ENGINE=INNODB;

CREATE TABLE Commentaire(
    idCommentaire VARCHAR(25) PRIMARY KEY NOT NULL,
    mailUtilisateur VARCHAR(40) NOT NULL,
    idArticle VARCHAR(25) NOT NULL,
    note INTEGER NOT NULL,
    texte VARCHAR(255) NOT NULL,
    date DATETIME DEFAULT NOW(),
    CONSTRAINT fk_commentaire_mailUtilisateur FOREIGN KEY(mailUtilisateur) REFERENCES Utilisateur(mail) ON DELETE CASCADE ON UPDATE CASCADE, 
    CONSTRAINT fk_commentaire_idArticle FOREIGN KEY(idArticle) REFERENCES Article(id) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=INNODB;

CREATE TABLE Commande(
    idCommande VARCHAR(25) PRIMARY KEY NOT NULL,
    mailUtilisateur VARCHAR(40) NOT NULL,
    CONSTRAINT fk_commande_mailUtilisateur FOREIGN Key(mailUtilisateur) REFERENCES Utilisateur(mail) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=INNODB;

CREATE TABLE DetailCommande(
    idCommande VARCHAR(25) NOT NULL,
    idArticle VARCHAR(25) NOT NULL,
    quantiteArticle INTEGER NOT NULL,
    CONSTRAINT fk_detail_idCommande FOREIGN KEY(idCommande) REFERENCES Commande(idCommande) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_detail_idArticle FOREIGN KEY(idArticle) REFERENCES Article(id) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=INNODB;
