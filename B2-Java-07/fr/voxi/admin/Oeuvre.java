package fr.voxi.admin;

public class Oeuvre {
    
    private int numero ;
    private String titre ;
    private int nbAudioBooks ;
    public static final int nbAudioBookMax = 5;

    

    public Oeuvre(int numero, String titre, int nbAudioBooks) {
        this.numero = numero;
        this.titre = titre;
        this.nbAudioBooks = nbAudioBooks;
    }

    @Override
    public String toString() {
        return "Oeuvre [numero=" + numero + ", titre=" + titre + ", audioBooks=" + nbAudioBooks + "]";
    }

    public String toHtml(){
        if(nbAudioBooks < nbAudioBookMax){
            return "<div> " + numero + "(" + nbAudioBooks + " produits) " + titre + " </div>" ;
        }
        else{
            return "<div> " + numero + "(<strong>Production bloquée</strong>) " + titre + " </div>" ;
        }
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
    public int getAudioBooks() {
        return nbAudioBooks;
    }
    public void setAudioBooks(int nbAudioBooks) {
        this.nbAudioBooks = nbAudioBooks;
    }

}
