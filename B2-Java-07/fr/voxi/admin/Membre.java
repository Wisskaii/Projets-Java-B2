package fr.voxi.admin;

public abstract class Membre {

    private int numero ;
    private String nom ;
    private String mail ;

    public Membre(int numero, String nom, String mail) {
        this.numero = numero;
        this.nom = nom;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Membre [numero=" + numero + ", nom=" + nom + ", mail=" + mail + "]";
    }

    public abstract String toHtml();

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

}
