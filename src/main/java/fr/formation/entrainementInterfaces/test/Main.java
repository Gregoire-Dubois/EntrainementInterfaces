package fr.formation.entrainementInterfaces.test;

import fr.formation.entrainementInterfaces.bo.Cottage;
import fr.formation.entrainementInterfaces.bo.Ship;
import fr.formation.entrainementInterfaces.bo.Voiture;

public class Main {
    public static void main(String[] args) {

        //instanciation de la class voiture qui hérite de la class abstraite Vehicule
        Voiture mavoiture = new Voiture();
        mavoiture.seDeplace("Je roule sur 4 roues");

        // instanciation de la class maMaison qui hérite de la class abstraite Cottage
        Cottage maMaison = new Cottage();
        maMaison.donneSonAdresse("Je suis située au 34 rue de Siam à Brest");
        maMaison.fly("Je suis la maison du film là haut");

        // instanciation de la class Ship qui hérite de la class abstraite Vehicule
        Ship monBateau = new Ship();
        monBateau.seDeplace("Je suis le batteau du capitaine crochet");

        // implémentation de l'interface Flyable pour redéfinir un comportement
        monBateau.fly("Je suis le bateau du Capitaine Crochet");
    }
}

/*
Le but de l'exercerice est de mettre en place une interfance entre des class differentes.

Deux class abstraites :
- Vehicule
- Building

La class abstraite Vehicule sera à l'origine des class :
- Ship
- Glider

La class abstraite Building sera à l'origine de :
- Cottage

L'objectif est de mettre en place une interface pour permettre aux class suivantes de voler:
- Ship #BateauDePeterPan ;)
- Cottage #LàHaut :)

 */