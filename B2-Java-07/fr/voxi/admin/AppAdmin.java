package fr.voxi.admin ;

import java.util.ArrayList;

public class AppAdmin {
    public static void main(String[] args) {
        
        Oeuvre ouevre1 = new Oeuvre(1, "Au revoir là-haut", 2) ;
        System.out.println(ouevre1.toString());
        System.out.println(ouevre1.toHtml());

        Biographie oeuvre2 = new Biographie(2, "Hannibal", 5, "Hannibal Barca") ;
        System.out.println(oeuvre2.toString());
        System.out.println(oeuvre2.toHtml());

        System.out.println("======================================");

        Auditeur selma = new Auditeur(289, "Selma", "selma.dradri@gmail.com", "Anglais", 35) ;
        Lecteur jules = new Lecteur(518, "Jules", "jules.ollouche@gmail.com", "Polonais", 4) ;

        System.out.println(selma.toString());
        System.out.println(jules.toString());

        System.out.println(selma.toHtml());
        System.out.println(jules.toHtml());

        ArrayList<Membre> lesMembres = new ArrayList<>() ;
        
        lesMembres.add(selma) ;
        lesMembres.add(jules) ;

        System.out.println("/////////////////////////////////////////");
        
        for(Membre membres : lesMembres){
            System.out.println(membres.toHtml());
        }

        System.out.println(jules.toHtml(3));

    }
}