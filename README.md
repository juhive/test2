Etudiantes: - Justine HIVERT
            - Sarah YESUFU

DB name: bean_user
DB USER: bean_user
BD PASSWORD : beanuser

Création de la table: 
  -table MESSAGE (KEY_VALUE VARCHAR(20), VALUE VARCHAR (200))

Execution du script: Déplacer les fichiers MessageClientClient.jar et MessageClientWorker.jar à la racine du projet puis exécuter le fichier script


L’application doit être réalisée en java. Vous fournirez également un diagramme de classe expliquant l’organisation de votre code. 

L’objectif de l’application est de développer un service et d’assurer un niveau minimum de qualité de service pour ce service.

Vous utiliserez une queue de message en ligne créée sur https://www.cloudamqp.com/ Soit une que je vous ai donnée, soit une que vous créerez vous-même

1 Session Bean
Ecrire un WebService qui permet d’écrire des messages dans une base de données avec l’interface post(String key,String value)

2 -Worker Queue
Chaque fois qu’il lit un message, il appelle la méthode post du Session Bean. Le message est composé d’un couple <clé,valeur>. La base de ce code est fournie. Vous devez ajouter la connection à la queue de message et l’écriture dans la base de données chaque fois qu’un message est lu.

3 - Ecrivez un client simple qui poste des messages dans la queue de message. (tag = Client)

4 - Ecrivez un script qui permet de lancer plusieurs workers et des clients qui postent des messages toutes les secondes. Le script doit permettre de choisir le nombre de workers et le nombre de clients.  (tag=Script)
