package fr.formation.entrainementInterfaces.bo;

public class Voiture extends Vehicule{
    @Override
    public void seDeplace(String message) {
        System.out.println(message);
    }

}
