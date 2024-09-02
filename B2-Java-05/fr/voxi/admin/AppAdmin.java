package fr.voxi.admin;

import java.time.LocalDate ;

public class AppAdmin {
    public static void main(String[] args) {
        
        Auteur GuyMau = new Auteur(111, "MAUPASSANT", "Guy") ;
        Oeuvre BelAmi = new Oeuvre(229, "Bel Ami", GuyMau) ;
        AudioBook BelAmiAudio = new AudioBook(229, "Français", BelAmi) ;
        Ecoute GuyMauListen = new Ecoute(510, LocalDate.of(2021, 02, 25), BelAmiAudio) ; // J'ai volontairement changer le jour dû à une erreur Java.

        Auteur AlexDum = new Auteur(112, "DUMAS", "Alexandre") ;
        Oeuvre LaReine = new Oeuvre(28, "La Reine Margot", AlexDum) ;
        Oeuvre Pauline = new Oeuvre(28, "Pauline", AlexDum) ;
        AudioBook LaReineEng = new AudioBook(224, "Anglais", LaReine) ;
        AudioBook LaReineFr = new AudioBook(225, "Français", LaReine) ;
        AudioBook PaulineEng = new AudioBook(228, "Anglais", Pauline) ;
        Ecoute LaReineEngListen = new Ecoute(505, LocalDate.of(2021, 02, 22), LaReineEng) ;
        Ecoute LaReineFrListen = new Ecoute(504 , LocalDate.of(2021, 02, 25), LaReineFr) ; // J'ai volontairement changer le jour dû à une erreur Java.
        Ecoute PaulineListen = new Ecoute(511, LocalDate.of(2021, 02, 22), PaulineEng) ;

        Auteur AlberCam = new Auteur(113, "CAMUS", "Albert") ;
        Auteur ReneBar = new Auteur(114, "BARJAVEL", "René") ;

        Oeuvre ChansonRolland = new Oeuvre(32, "Chanson de Rolland", null) ;
        AudioBook ChansonRollandFr = new AudioBook(223, "Francais", ChansonRolland) ;

        // // Il y avait une erreur dans le TP, deux numéros d'Ecoutes portaient le même audiobook.
        Ecoute ChansonRollandListen = new Ecoute(503, LocalDate.of(2021, 02, 28), ChansonRollandFr) ;

        // Exercices

        Auteur aut115 = new Auteur(115, "SAND", "Georges") ; // 1
        System.out.println(aut115.toString()); // 2
        System.out.println(aut115.getNom()); // 3

        Oeuvre oeuvre35 = new Oeuvre(35, "Indiana", aut115) ; // 4
        System.out.println(oeuvre35.toString()); // 5
        System.out.println(oeuvre35.getTitre()); // 6
        System.out.println(oeuvre35.getAuteur()); // 7
        System.out.println(oeuvre35.getAuteur().getNom()); // 8

        AudioBook audio235 = new AudioBook(235, "Français", oeuvre35) ; // 9
        System.out.println(audio235.toString()); // 10
        System.out.println(audio235.getOeuvre()); // 11
        System.out.println(audio235.getOeuvre().getTitre()); // 12
        System.out.println(audio235.getOeuvre().getAuteur()); // 13
        System.out.println(audio235.getOeuvre().getAuteur().getNom()); // 14

        Auteur[] auteurs = {
            GuyMau,
            AlexDum,
            AlberCam,
            ReneBar,
        } ; // 15

        for(Auteur Auteur : auteurs){
            System.out.println(Auteur.getNom() + " " + Auteur.getPrenom());
        } // 16

        for(Auteur Auteur : auteurs){
            if(Auteur.getNumero() == 113){
                System.out.println(Auteur.getNom() + " " + Auteur.getPrenom());
            }
        }

        Oeuvre[] oeuvres = {
            BelAmi,
            LaReine,
            Pauline,
            ChansonRolland
        } ; // 18
        
        int nbAuteursInconnus = 0 ;
        for(Oeuvre Oeuvre : oeuvres){
            if(Oeuvre.getAuteur() == null){
                nbAuteursInconnus++;
            }
        }
        System.out.println("Il y a " + nbAuteursInconnus + " auteur.s inconnu.s"); // 19

        for(Oeuvre Oeuvre : oeuvres){

            String titre = Oeuvre.getTitre();
            Auteur Auteur = Oeuvre.getAuteur();

            if(Auteur != null){
                System.out.println("Titre : " + titre + ", Nom de l'Auteur : " + Auteur.getNom() );
            }
            else{
                System.out.println("Titre : " + titre + ", Nom de l'Auteur : Inconnu" );
            }
        } // 20

        int nbOeuvresAlexDumas = 0 ;
        for(Oeuvre Oeuvre : oeuvres){
            Auteur Auteur = Oeuvre.getAuteur();
            if(Auteur != null){
                if( Oeuvre.getAuteur().getPrenom() == "Alexandre"  && Oeuvre.getAuteur().getNom() == "DUMAS"){
                    nbOeuvresAlexDumas++ ;
                }
            }
        }
        System.out.println("Alexandre DUMAS a produit : " + nbOeuvresAlexDumas + " oeuvres"); // 21

        AudioBook[] audios = {
            BelAmiAudio,
            LaReineEng,
            LaReineFr,
            PaulineEng,
            ChansonRollandFr
        } ; // 22
        
        for(AudioBook audioBook : audios){
            Auteur Auteur = audioBook.getOeuvre().getAuteur() ;
            if(Auteur != null){
                System.out.println("Nom et prénom de l'Ateur : " + audioBook.getOeuvre().getAuteur().getNom() + " " +
                audioBook.getOeuvre().getAuteur().getPrenom() + ", Titre de l'oeuvre : " + audioBook.getOeuvre().getTitre());
            }
            else{
                System.out.println("Nom et prénom de l'Ateur : Inconnu, Titre de l'Oeuvre : " + audioBook.getOeuvre().getTitre());
            }
        } // 23

        int nbAudioBooksReneBar = 0 ;
        for(AudioBook audioBook : audios){
            Auteur Auteur = audioBook.getOeuvre().getAuteur() ;
            if(Auteur != null){
                if(Auteur.getNom() == "BARJAVEL" && Auteur.getPrenom() == "René"){
                    nbAudioBooksReneBar++ ;
                }
            }
        }
        System.out.println("René BARJAVEL a produit : " + nbAudioBooksReneBar + " oeuvres"); // 24

        Ecoute[] ecoutes = {
            GuyMauListen,
            LaReineEngListen,
            LaReineFrListen,
            PaulineListen,
            ChansonRollandListen
        } ; // 25

        LocalDate derniereEcoute = LocalDate.of(1900, 1, 1) ;
        for(Ecoute ecoute : ecoutes){
            if(ecoute.getDate().isAfter(derniereEcoute)){
                derniereEcoute = ecoute.getDate();
            }
        }
        System.out.println("La derière écoute date du : " + derniereEcoute); // 26

        for(Ecoute ecoute : ecoutes){
            AudioBook audioBook = ecoute.getAudioBook();
            if(audioBook.getOeuvre().getAuteur() != null){
                String nomAuteur = audioBook.getOeuvre().getAuteur().getNom() ;
                String prenomAuteur = audioBook.getOeuvre().getAuteur().getPrenom() ;
                System.out.println("Titre de l'Oeuvre : " + audioBook.getOeuvre().getTitre() + ", Nom de l'auteur : " +  nomAuteur + ", Prénom de l'Auteur : " + prenomAuteur );
            }
            else{
                System.out.println("Titre de l'Oeuvre : " + audioBook.getOeuvre().getTitre() + ", Nom et Prénom de l'Auteur inconnus ");
            }
        } // 27

        for(Ecoute ecoute : ecoutes){
            AudioBook audioBook = ecoute.getAudioBook() ;
            Auteur Auteur = audioBook.getOeuvre().getAuteur() ;
            if(Auteur != null){
                if(Auteur.getNom() == "DUMAS" && Auteur.getPrenom() == "Alexandre"){ // J'ai mis Alexandre DUMAS car Guy de MAUPASSANT n'a pas fais d'oeuvres en anglais
                    if(audioBook.getLangue() == "Anglais"){
                        System.out.println("L'Oeuvre : " + "\"" + audioBook.getOeuvre().getTitre() + "\"" + " en anglais, a actuellement " + audioBook.getNumero() + " écoutes");
                    }
                }
            }
        } // 28

    }
}
