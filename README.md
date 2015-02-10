# Framework-de-log

###Objectif : Concevoir et développer un framework de logging.

#####Un même message peut donner lieu à plusieurs "cibles":
    - une trace dans la console
    - une ligne dans un fichier
    - un enregistrement dans une base de donnée
    - un mail à destination d'une équipe support
    - etc...
    
####Nous nous basons sur les 3 composants générique d'un framework de log:
    - un logger pour émettre le message
    - un formateur pour personnaliser le contenu du message
    - une ou plusieurs cibles pour stocker le message
    
####A faire : 
    - architecture des cibles
    - API de logging
    - règles de priorité des logs
    - identification d'un logger
    - configuration du framework
    - spécification du framework de logging
    - respecter les règles de design Objet
