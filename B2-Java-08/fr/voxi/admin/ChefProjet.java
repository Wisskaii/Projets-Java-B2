package fr.voxi.admin;

public class ChefProjet extends Collaborateur {
    
    private int anneeExperience ;
    private int nbProjetsDiriges ;
    
    public ChefProjet(String matricule, String nom, String prenom, int anneeExperience, int nbProjetsDiriges) {
        super(matricule, nom, prenom);
        this.anneeExperience = anneeExperience;
        this.nbProjetsDiriges = nbProjetsDiriges;
    }

    @Override
    public String toString() {
        return "ChefProjet [anneeExperience=" + anneeExperience + ", nbProjetsDiriges=" + nbProjetsDiriges + "]";
    }

    @Override
    public String toHtml(){
        return "<div id=\"" + getMatricule() + "\"" + " class=\"chefProjet\"> " + getPrenom() + " <strong> NOM : " + getNom() + " </strong>" 
        + "Expérience : " + anneeExperience + " Nombre de projets : " + nbProjetsDiriges + " </div>" ;
    }

    @Override
    public String toJSON(){
        return "{ \"matricule\" : " + "\"" + getMatricule() + "\",\n"
        + "\"Nom\" : " + "\"" + getNom() + "\",\n"
        + "\"Prénom\" : " + "\"" + getPrenom() + "\",\n"
        + "\"Expérience\" : " + "\"" + getAnneeExperience() + "\",\n"
        + "\"Nombre de projets\" : " + "\"" + getNbProjetsDiriges() + "\",\n" ;
    }

    public int getAnneeExperience() {
        return anneeExperience;
    }

    public void setAnneeExperience(int anneeExperience) {
        this.anneeExperience = anneeExperience;
    }

    public int getNbProjetsDiriges() {
        return nbProjetsDiriges;
    }

    public void setNbProjetsDiriges(int nbProjetsDiriges) {
        this.nbProjetsDiriges = nbProjetsDiriges;
    }

}
