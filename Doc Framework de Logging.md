#Doc Framework de Log

#####Autheurs : [@REMY123](https://github.com/REMY123), [@bayakissa](https://github.com/bayakissa), [@hamza0208](https://github.com/hamza0208)



###En quoi consiste notre Framework de Logging ?

Il permet au développeur de réaliser de manière simple et rapide un journal/affichage des 
logs, lui permettant de suivre la bonne progression de ses projets.




###Installation

Pous installer notre Framework vous pouvez télécharger le dernier release ici : 

[Release Framework de Log](https://github.com/REMY123/Framework-de-log/releases)

Il vous faut télécharger le fichier .jar fourni.
Une fois dans Eclipse, 


* cliquez droit sur le nom de votre projet 
* "Build Path"
* "Add External Archives"
* Dans le browser, choisissez le fichier .jar et ajoutez le à votre projet.
* C'est fait !




###Architecture et utilisation du framework de log:

Architecture du framework de log:

Notre framework de log est composé de 9 classes:

####Une partie configuration:

#####Createur
permet de créer un nouveau loger.
*ex de code*:
```java 
Logger log = Createur.getlog(Main.class);
```

#####Config
Permet de configurer le log :

1) depuis le fichier properties placé en paramètre, *ex de code*:
```java
Config.properties(“cible.properties“ ,log);
```
Le fichier properties doit avoir un format particulier:
*ex*:
```java
Level = DEBUG
Cible1=../../opaque.txt
Cible2=opaque2.txt
RotatifCible1=src/ivoire.txt
RotatifCible2=ivoirese.txt
RotatifCible3=ok.txt
MessageInfo = c’est pour les infos 
MessageError= c’est pour les erreurs
MessageDebug= c’est pour les debug
```

Pour ajouter des cibles dans le fichier properties il faut donc écrire: Cible1=… si 
une cible, Cible1=… Cible2=… si deux cibles, Cible1=… Cible2=… Cibles3 etc…
Lorsque l'on écrit Cible1=Console, cela ne crée pas un fichier "Console" mais écrit 
directement sur la console.

De la meme manière pour ajouter des cibles de fichier rotatifs= RotatifCible1=… RotatifCible2=… etc…

2) Si on ne configure pas le log à partir d’un fichier properties, il est possible 
de le faire directement *en ligne de code*:

```java
Config.level(log.classe, Level.INFO);
Config.addCible(log.classe, « fichier. txt»);
Config.addCibleR(log.classe, « fichierRotatif. txt»); // cible fichier rotatif
log.info(« c’est pour l’info »);
log.debug(« c’est pour les debug »);
log.error(« c’est pour les erreurs »);
```
Lorsque l'on écrit "Config.addCible(log.classe, "Console");", cela écrit sur la console.


Si l’on veut supprimer une cible dont on de veut plus:
```java
Config.suppCible(log.classe, « fichier.txt »);   
Config.suppCibleR(log.classe, « fichierRotatif.txt »);  //cible de fichier rotatif
```

Si on ne configure pas le log, celui-ci se configure avec des valeurs par défaut 
level: DEBUG
messageInfo: ceci est un message d’info par defaut
messageDebug : ceci est un message debug par defaut
messageError: ceci est un message error par defaut


#####Logger
C’est la classe constructeur du log, elle permet de lui fournir tous ses attributs, de les modifier, et d’y accéder (getter/setter).
Elle contient la méthode show(), qui permet de lancer l’écriture des messages du log dans les cibles.
*ex de code depuis le main()*:

```java
Logger log = Createur.getlog(Main.class);
Config.properties(“cible.properties“ ,log);
log.show();
// ici on a créé un log, on l’a configuré avec le fichier properties, ensuite on écrit les messages du log dans toutes les cibles définies.
```


#####Level
Contient une enumeration des différents level.


#####Formateur
La possibilité de définir son propre formateur n’est pas gérer sur le code posté ici, le formateur par défaut est toujours utilisé. la fonctionnalité de créer ses propres formateurs sera ajouté dans la prochaine update. 


#####FormateurDefault
C’est le formateur par défaut, si aucun formateur n’est défini par l’utilisateur, c’est celui-ci qui formera les messages.
*ex d’appel*:
```java
F = new FormateurDefault();
F.Formateur(Logger log, String message, Level lev);
```

####Une partie écriture dans les cibles:


#####FileCible
Prend en paramètre un message et une cibles, si la cible existe elle écrit dedans le message, sinon elle crée le fichier, et écris le message.
*ex d’appel*:
```java
FileCible.cible(String message, String cible);
```


#####ConsoleCible
Prend en paramètre un message, et écrit se message dans la console.
*ex d’appel*:
```java
ConsoleCible.cible(String message);
```


#####FichierRotatif
Prend en paramètre un message et une cibles de fichier rotatifs, si la cible existe elle écrit dedans le message, quand le fichier atteint 20 lignes de texte, les premières lignes sont effacées et les nouvelles se rajoutent à la fin du fichier (fichier déroulant), sinon elle crée le fichier, et écris le message.
*ex d’appel*:
```java
FileCible.cible(String message, String cible);
```
