package fr.formation.entrainementInterfaces.bo;

public class Cottage extends Building implements Flyable{
    @Override
    public void donneSonAdresse(String adresse) {
        System.out.println(adresse);
    }

    @Override
    public void fly(String message) {
        System.out.println(message);
    }
}
