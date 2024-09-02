package fr.voxi.admin;

public class Auditeur extends Membre {

    private String languePref ;
    private int nbOeuvresEcoutees ;
    
    public Auditeur(int numero, String nom, String mail, String languePref, int nbOeuvresEcoutees) {
        super(numero, nom, mail);
        this.languePref = languePref;
        this.nbOeuvresEcoutees = nbOeuvresEcoutees;
    }

    @Override
    public String toString() {
        return "Auditeur [languePref=" + languePref + ", nbOeuvresEcoutees=" + nbOeuvresEcoutees + "]";
    }

    @Override
    public String toHtml(){
        return "<span id=" + getNumero() + " " + "class=\"auditeur\"> " + getNom() + " (<em>" + languePref + "</em>) </span>" ;
    }

    public String getLanguePref() {
        return languePref;
    }

    public void setLanguePref(String languePref) {
        this.languePref = languePref;
    }

    public int getNbOeuvresEcoutees() {
        return nbOeuvresEcoutees;
    }

    public void setNbOeuvresEcoutees(int nbOeuvresEcoutees) {
        this.nbOeuvresEcoutees = nbOeuvresEcoutees;
    }

}
