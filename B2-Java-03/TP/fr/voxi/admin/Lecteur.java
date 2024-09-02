package fr.voxi.admin;

public class Lecteur {

    int numero ;
    String Nom ;
    String Prénom;
    int nbAudiobooksProduits ;

    Lecteur(int numero, String Nom, String Prénom, int nbAudiobooksProduits){
        this.numero = numero ;
        this.Nom = Nom ;
        this.Prénom = Prénom ;
        this.nbAudiobooksProduits = nbAudiobooksProduits ;
    }

    Lecteur(int numero, String Nom, String Prénom){
        this.numero = numero ;
        this.Nom = Nom ;
        this.Prénom = Prénom ;
        nbAudiobooksProduits = 0 ;
    }

    @Override
    public String toString(){
        return "Lecteur[" +
            "numero=" + numero +
            ", Nom='" + Nom + '\'' +
            ", Prénom='" + Prénom + '\'' +
            ", nbAudiobooksProduits=" + nbAudiobooksProduits +
            ']';
    }

    public String estActif(){
        if(this.nbAudiobooksProduits > 10){
            return "L'utilisateur est actif" ;
        }
        else{
            return "L'utilisateur est passif" ;
        }
    }

    public int produireUnAudiobook(){
        return this.nbAudiobooksProduits++ ;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrénom() {
        return Prénom;
    }

    public void setPrénom(String prénom) {
        Prénom = prénom;
    }

    public int getNbAudiobooksProduits() {
        return nbAudiobooksProduits;
    }

    public void setNbAudiobooksProduits(int nbAudiobooksProduits) {
        this.nbAudiobooksProduits = nbAudiobooksProduits;
    }

    

}
