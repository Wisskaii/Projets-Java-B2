package fr.voxi.admin;

public class Evaluation {
    
    private int numero ;
    private int note ;
    private int nbLikes ;
    private String commentaire ;
    private boolean valide ;

    Evaluation(int numero , int note , String commentaire , int nbLikes, boolean valide){
        this.numero = numero ;
        this.note = note ;
        this.commentaire = commentaire ;
        this.nbLikes = nbLikes ; 
        this.valide = valide ;
    }

    Evaluation(int numero , int note , String commentaire){
        this.numero = numero ;
        this.note = note ;
        this.commentaire = commentaire ;
        this.nbLikes = 0 ; 
        this.valide = false ;
    }

    int ajouterLike(){
        return nbLikes++ ;
    }

    @Override
    public String toString(){
        return "[ " + numero + ", " + note + ", " + commentaire + ", " + nbLikes + ", " + valide + " ]" ;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getNbLikes() {
        return nbLikes;
    }

    public void setNbLikes(int nbLikes) {
        this.nbLikes = nbLikes;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public boolean isValide() {
        return valide;
    }

    public void setValide(boolean valide) {
        this.valide = valide;
    }

    
}
