package fr.voxi.admin;

public class Collaborateur {
    
    private String matricule ;
    private String nom ;
    private String prenom ;

    public Collaborateur(String matricule, String nom, String prenom) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Collaborateur [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + "]";
    }

    public String toHtml(){
        return "<div id=\"" + matricule + "\"" + " class=\"collaborateur\"> " + prenom + " <strong> " + nom + " </strong> </div>" ;
    }

    public String toJSON(){
        return "{ \"matricule\" : " + "\"" + matricule + "\",\n"
        + "\"Nom\" : " + "\"" + nom + "\",\n"
        + "\"Prénom\" : " + "\"" + prenom + "\",\n" ;
    }

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}
