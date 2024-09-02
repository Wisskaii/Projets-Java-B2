package fr.voxi.admin;

public class Oeuvre {
    
    private int numero ;
    private String titre ;
    private static int nbOeuvre = 0 ;

    public Oeuvre(int numero, String titre){

        this.numero = numero ;
        this.titre = titre ;
        nbOeuvre++ ;

    }

    @Override
    public String toString(){
        return "[ Numéro : " + numero + ", Titre : " + titre +  " ]" ;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbOeuvre() {
        return nbOeuvre;
    }

}
