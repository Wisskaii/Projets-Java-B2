package fr.voxi.admin ;

import java.time.LocalDate;

public class AppAdmin {

    public static void main(String[] args) {
        
        Oeuvre oeuvre103 = new Oeuvre(103, "Le Crépuscule et l'Aube");
        System.out.println(oeuvre103.toString());
        System.out.println(oeuvre103.getNbOeuvre());

        Oeuvre oeuvre302 = new Oeuvre(302, "Nature Humaine") ;
        System.out.println(oeuvre302.toString());
        System.out.println(oeuvre103.getNbOeuvre());

        Oeuvre oeuvre318 = new Oeuvre(318, "L'Anomalie") ;
        System.out.println(oeuvre318.toString());
        System.out.println(oeuvre318.getNbOeuvre());
        System.out.println(oeuvre103.getNbOeuvre());

        // On cherche à démontrer que le compteur fonctionne correctement qu'elle que soit l'objet utilisé par l'accesseur.

        Abonnement abn1 = new Abonnement(201, LocalDate.of(2024, 1, 3));
        System.out.println("Item: " + abn1);

        Abonnement abn2 = new Abonnement(202, LocalDate.of(2024, 10, 1));
        System.out.println("Item: " + abn2);

        System.out.println(Abonnement.getDureeAbonnement());
        Abonnement.setDureeAbonnement(5);
        System.out.println("Désormais, la durée d'un abonnement est de 5 mois !");
        System.out.println(Abonnement.getDureeAbonnement());

        abn1.setDureeAbonnement(7);
        System.out.println("L'abonnée 201 à désormais un abonnement de 7 mois !");
        System.out.println(abn1.getDureeAbonnement());
        System.out.println(abn2.getDureeAbonnement());
        System.out.println(Abonnement.getDureeAbonnement());

    }

}