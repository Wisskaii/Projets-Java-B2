package fr.voxi.admin;

public class Developpeur extends Collaborateur {
    
    int competence ;
    int soldeRtt ;
    
    public Developpeur(String matricule, String nom, String prenom, int competence, int soldeRtt) {
        super(matricule, nom, prenom);
        this.competence = competence;
        this.soldeRtt = soldeRtt;
    }

    @Override
    public String toString() {
        return "Developpeur [competence=" + competence + ", soldeRtt=" + soldeRtt + "]";
    }

    @Override
    public String toHtml(){

        String competenceTrad ;
        switch (competence) {

            case 1:
                competenceTrad = "Débutant" ;
                break;
            
            case 2:
                competenceTrad = "Avancée" ;
                break;

            case 3:
                competenceTrad = "Intermédiaire" ;
                break;

            case 4:
                competenceTrad = "Très avancée" ;
                break;

            case 5:
                competenceTrad = "Expert" ;
                break;

            default:
                competenceTrad = "Maîtrise incorrecte";
        }

        return "<div id=\"" + getMatricule() + "\"" + " class=\"developpeur\"> " + getPrenom() + " <strong> NOM : " + getNom() + " </strong>" 
        + "Niveau de compétence : " + competenceTrad + " RTT : " + soldeRtt + " </div>" ;

    }

    public void crediterRtt(int nbRtt){
        soldeRtt = soldeRtt + nbRtt ;
    }

    public void debiterRtt(int nbRtt){
        soldeRtt = soldeRtt - nbRtt ;
    }

    public int getCompetence() {
        return competence;
    }

    public void setCompetence(int competence) {
        this.competence = competence;
    }

    public int getSoldeRtt() {
        return soldeRtt;
    }

    public void setSoldeRtt(int soldeRtt) {
        this.soldeRtt = soldeRtt;
    }

}
