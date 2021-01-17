INSERT INTO galerie(id, nom, adresse) VALUES (1, 'Saatchi', 'King\''s Road, Londre');
INSERT INTO galerie(id, nom, adresse) VALUES (2, 'Kiki', 'Kiki Road, Londre');

INSERT INTO Exposition(id, debut, duree,intitule, organisateur_id) VALUES (1,TO_DATE('15/01/2021','DD/MM/YYYY'), 10, 'expo1',1);
INSERT INTO Exposition(id, debut, duree,intitule, organisateur_id) VALUES (2,TO_DATE('16/01/2021','DD/MM/YYYY'), 20, 'expo2',1);
INSERT INTO Exposition(id, debut, duree,intitule, organisateur_id) VALUES (3,TO_DATE('17/01/2021','DD/MM/YYYY'), 30, 'expo3',2);
INSERT INTO Exposition(id, debut, duree,intitule, organisateur_id) VALUES (4,TO_DATE('18/01/2021','DD/MM/YYYY'), 40, 'expo4',2);

INSERT INTO Personne(id, nom, adresse) VALUES (1, 'COCO', 'Paris');
INSERT INTO Personne(id, nom, adresse) VALUES (2, 'Boubou', 'Seoul');


INSERT INTO Artist(id, biographie) VALUES (2, 'Artiste de ville');

INSERT INTO Tableau (id, titre, support, hauteur, largeur, auteur_id) VALUES (1, 'Magnifique', 'Carré', 100, 50, 1);
INSERT INTO Tableau (id, titre, support, hauteur, largeur, auteur_id) VALUES (2, 'Wow', 'Carré', 100, 50, 3);
INSERT INTO Tableau (id, titre, support, hauteur, largeur, auteur_id) VALUES (3, 'Daeback', 'Carré', 100, 50, 2);

INSERT INTO exposition_oeuvres(accrochage_id, oeuvres_id) VALUES (4, 1);

INSERT INTO Transaction(id, vendu_Le, prix_Vente,client_id, lieu_de_vente_id, oeuvre_id) VALUES (1, TO_DATE('15/01/2021','DD/MM/YYYY'),1000, 1, 2, 3); 
INSERT INTO Transaction(id, vendu_Le, prix_Vente,client_id, lieu_de_vente_id, oeuvre_id) VALUES (2, TO_DATE('16/01/2021','DD/MM/YYYY'),8000, 2, 4, 1);
