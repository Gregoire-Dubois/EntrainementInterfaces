package fr.formation.entrainementInterfaces.bo;

public class Ship extends Vehicule implements Flyable{
    @Override
    public void fly(String message) {
        System.out.println();

    }

    @Override
    public void seDeplace(String message) {
        System.out.println(message);
    }
}
