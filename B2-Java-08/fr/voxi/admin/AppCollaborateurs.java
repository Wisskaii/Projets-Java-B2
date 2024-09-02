package fr.voxi.admin ;

import java.util.ArrayList ;

public class AppCollaborateurs {

    public static void main(String[] args) {
        
        ArrayList<Collaborateur> lesCollaborateurs = new ArrayList<>() ;

        lesCollaborateurs.add(new Collaborateur("C133", "BA", "Béchir")) ;

        lesCollaborateurs.add(new ChefProjet("R289", "ZAKI", "Selma", 12, 19)) ;
        lesCollaborateurs.add(new ChefProjet("C141", "CAMOIT", "Alexis", 15, 23)) ;

        lesCollaborateurs.add(new Developpeur("L518", "LEBRETON", "Jules", 3, 33)) ;
        lesCollaborateurs.add(new Developpeur("L530", "WILLMANN", "Florian", 2, 28)) ;
        lesCollaborateurs.add(new Developpeur("L541", "MACEDO", "Cody", 5, 130)) ;

        System.out.println("//// Matricule et Nom de chaque collaborateurs ////\n");

        for (Collaborateur collaborateur : lesCollaborateurs) {
            System.out.println("Matricule : " + collaborateur.getMatricule() + " " + "/ Nom : " + collaborateur.getNom() + "\n");
        }

        System.out.println("//// Méthode toHtml() de chaque collaborateurs ////\n");

        for (Collaborateur collaborateur : lesCollaborateurs) {
            System.out.println(collaborateur.toHtml() + "\n");
        }

        System.out.println("//// Méthode toJSON() de chaque collaborateurs ////\n");

        for (Collaborateur collaborateur : lesCollaborateurs) {
            System.out.println(collaborateur.toJSON() + "\n");
        }

        System.out.println("//// Afficher le nom et le nombre de projets de chaque chef de projets ////\n");

        for (Collaborateur collaborateur : lesCollaborateurs) {
            if(collaborateur instanceof ChefProjet){
                System.out.println("Le chef de projet : " + collaborateur.getNom() + ", a gérer : " + ((ChefProjet) collaborateur).getAnneeExperience() + " projets");
            }
        }

        System.out.println("//// Crediter une journée de RTT à chaque développeur ////\n");

        for (Collaborateur collaborateur : lesCollaborateurs) {
            if(collaborateur instanceof Developpeur){
                ((Developpeur) collaborateur).crediterRtt(1);
            }
        }

        System.out.println("//// Afficher RTT de chaque développeur ////\n");

        for (Collaborateur collaborateur : lesCollaborateurs) {
            if(collaborateur instanceof Developpeur){
                System.out.println("Nom du développeur : " + collaborateur.getNom() + " / Journée de RTT disponibles : " + ((Developpeur)collaborateur).getSoldeRtt());
            }
        }

        System.out.println("//// Débiter RTT de chaque développeur ////\n");

        for (Collaborateur collaborateur : lesCollaborateurs) {
            if(collaborateur instanceof Developpeur){
                ((Developpeur) collaborateur).debiterRtt(1);
            }
        }

    }

}