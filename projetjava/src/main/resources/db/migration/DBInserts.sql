INSERT INTO Utilisateur VALUES("julien.deprez@gmail.com", "Olivier", "Hayot", "7110eda4d09e062aa5e4a390b0a572ac0d2c0220", 1);
INSERT INTO Utilisateur VALUES("morgane@gmail.com", "Laurent", "Hayot", "2abd55e001c524cb2cf6300a89ca6366848a77d5", NULL);


INSERT INTO Article VALUES("PRO_1", "The Brown", "Une machine haut de gamme permettant de faire votre café comme si il était fait par un professionnel ", 149.99, "Cafetiere");
INSERT INTO Article VALUES("PRO_2", "The White", "Une machine à café standard qui vous fera expérimenter d'incroyables cafés provenant de notre marque", 99.99, "Cafetiere");
INSERT INTO Article VALUES("PRO_3", "The Cream", "Une machine à café pour tous les budget. Que serait un monde sans café?", 79.99, "Cafetiere");
INSERT INTO Article VALUES("PRO_4", "Alban", "Sa puissante amertume et ses notes poivrées sont équilibrées par une texture dense et crémeuse", 0.4, "Europe");
INSERT INTO Article VALUES("PRO_5", "Nabil", "Sa puissante personnalité révèle des notes torréfiées intenses ainsi que des touches de céréales grillées et de cacao amer.", 0.38, "Europe");
INSERT INTO Article VALUES("PRO_6", "Antoine", "Notes hautement torréfiées, adoucies par des notes chocolatées. Un contraste subtil entre force et amertume.", 0.39, "Europe");
INSERT INTO Article VALUES("PRO_7", "Mayne", "Un mélange complexe et contrasté. Les Arabicas sont cultivés à haute altitude, apportent une légère acidité", 0.4, "Europe");
INSERT INTO Article VALUES("PRO_8", "Andre", "Andre est le café idéal pour ceux qui souhaitent un expresso court et doux à la fois", 0.45, "Europe");
INSERT INTO Article VALUES("PRO_9", "Shen", "Il exhale un bouquet fleuri rappelant le jasmin, la fleur d'oranger, la bergamote et des touches de notes sauvages de bois", 0.49, "Asie");
INSERT INTO Article VALUES("PRO_10", "Charles", "Un café d'une grande richesse, aux notes de céréales sucrées et grillées maltées qui offre une agréable amertume", 0.42, "Europe");
INSERT INTO Article VALUES("PRO_11", "Nicolas", "Il tient son caractère puissant et son corps dense d'un mélange d'Arabicas d'Amérique du Sud et centrale", 0.4, "Amérique Latine");
INSERT INTO Article VALUES("PRO_12", "Fujitsu", "Cet assemblage d'Arabicas a été torréfié légèrement pour créer un mélange délicat et équilibré", 0.39, "Asie");
INSERT INTO Article VALUES("PRO_13", "Angela", "Ce mélange d'Arabicas d'Amérique du Sud et centrale est moyennement torréfié afin de révéler un bouquet rond et très équilibré", 0.38, "Amérique Latine");
INSERT INTO Article VALUES("PRO_14", "Samuel", "Samuel est un espresso au bouquet harmonieux avec une fine acidité et une note céréale très caractéristique", 0.35, "Europe");
INSERT INTO Article VALUES("PRO_15", "Didier", "Il déploie des notes douces et biscuitées ainsi qu'une légère note fruitée sur un corps rond", 0.4, "Europe");

INSERT INTO Commentaire VALUES("COM_1", "olivier.hayot@mail.com", "PRO_4", 4, "Pas mal comme goût", NOW());
INSERT INTO Commentaire VALUES("COM_2", "test.test@mail.com", "PRO_5", 1, "un peu mauvais", NOW());
INSERT INTO Commentaire VALUES("COM_3", "olivier.hayot@mail.com", "PRO_4", 5, "J'aime de plus en plus", NOW());
INSERT INTO Commentaire VALUES("COM_4", "test.test@mail.com", "PRO_5", 4, "En regoutant, j'avoue que ce n'est pas si mauvais!", NOW());

INSERT INTO Commande VALUES("ORD_1", "olivier.hayot@mail.com");
INSERT INTO Commande VALUES("ORD_2", "olivier.hayot@mail.com");

INSERT INTO DetailCommande VALUES("ORD_1", "PRO_1", 2);
INSERT INTO DetailCommande VALUES("ORD_1", "PRO_10", 10);
INSERT INTO DetailCommande VALUES("ORD_1", "PRO_8", 20);
INSERT INTO DetailCommande VALUES("ORD_2", "PRO_2", 1);
INSERT INTO DetailCommande VALUES("ORD_2", "PRO_4", 10);