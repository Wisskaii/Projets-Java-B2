package fr.voxi.admin ;

import java.util.ArrayList;

public class AppAdmin {
    public static void main(String[] args) {

        ArrayList<Personnage> lesPersos = new ArrayList<>() ;
        lesPersos.add(new Personnage(28, "Joe")) ;
        lesPersos.add(new Personnage(32, "Willy")) ;
        lesPersos.add(0, new Personnage(27, "Laura")) ;
        lesPersos.add(1, new Personnage(43, "Charles")) ;

        System.out.println(lesPersos.size());
        System.out.println(lesPersos.get(1).getNom());

        Personnage monPerso = lesPersos.get(2) ;
        int indice = lesPersos.indexOf(monPerso) ;
        System.out.println("Indice du personnage : " + indice);

        Personnage autrePerso = new Personnage(28, "Joe") ;
        int indice2 = lesPersos.indexOf(autrePerso) ;
        System.out.println("Position du personnage : " + indice2);

        lesPersos.set(2, new Personnage(29, "Nels"));
        lesPersos.remove(2);

        System.out.println("======================================");

        for(int i = 0 ; i < lesPersos.size() ; i++){
            System.out.println(lesPersos.get(i).getNom());
        }

        System.out.println("======================================");

        for(Personnage persos : lesPersos){
            System.out.println(persos.getNom());
        }

    }
}