package p3.fr.voxi.admin;

import java.time.LocalDate;

public class Candidature {
    
    private int numero ;
    private LocalDate dateDeDepot ;
    private LocalDate dateDeReponse ;
    private int etatCandidature ;
    
    private static final int EN_ATTENTE = 1;
    private static final int ETUDIEE = 2;
    private static final int ANNULEE = 3;
    private static final int ACCEPTEE = 4;
    private static final int REJETEE = 5;

    Candidature(int numero , LocalDate dateDeDepot, LocalDate dateDeReponse, int etatCandidature){
        this.numero = numero ;
        this.dateDeDepot = dateDeDepot ;
        this.dateDeReponse = dateDeReponse ;
        this.etatCandidature = etatCandidature ;
    }

    Candidature(int numero, LocalDate dateDeDepot){
        this.numero = numero ;
        this.dateDeDepot = dateDeDepot ;
        this.etatCandidature = EN_ATTENTE ;
    }

    public void Etudier(){
        if(etatCandidature == EN_ATTENTE){
            etatCandidature = ETUDIEE ;
            System.out.println("La candidature " + numero + " est maintenant étudiée");
        }
        else{
            System.out.println("La candidature " + numero + " ne peut pas être étudiée");
        }
    }

    public void Annuler(){
        if(etatCandidature == EN_ATTENTE){
            etatCandidature = ANNULEE ;
            System.out.println("La candidature " + numero + " est maintenant annulée");
        }
        else{
            System.out.println("La candidature " + numero + " ne peut pas être annulée");
        }
    }

    public void Rejeter(){
        if(etatCandidature == ETUDIEE){
            etatCandidature = REJETEE ;
            System.out.println("La candidature " + numero + " est maintenant rejetée");
        }
        else{
            System.out.println("La candidature " + numero + " ne peut pas être rejetée");
        }
    }

    public void Accepeter(){
        if(etatCandidature == ETUDIEE){
            etatCandidature = ACCEPTEE ;
            dateDeReponse = LocalDate.now() ;
            System.out.println("La candidature " + numero + " est maintenant acceptée");
        }
        else{
            System.out.println("La candidature " + numero + " ne peut pas être acceptée");
        }
    }

    @Override
    public String toString(){

        String etatCandidatureTexte ;
        switch (etatCandidature) {

            case EN_ATTENTE:
                etatCandidatureTexte = "En attente" ;
                break ;
            
            case ETUDIEE:
                etatCandidatureTexte = "Etudiée" ;
                break ;
            
            case ANNULEE:
                etatCandidatureTexte = "Annulée" ;
                break ;
            
            case ACCEPTEE:
                etatCandidatureTexte = "Acceptée" ;
                break ;
            
            case REJETEE:
                etatCandidatureTexte = "Rejetée" ;
                break ;

            default:
                etatCandidatureTexte = "Inexistant" ;
                break;

        }

        return "[ Numéro de la candidature : " + numero + ", Date de dépôt : " + dateDeDepot + 
        ", Date de réponse : " + dateDeReponse + ", Etat de la candidature : " + etatCandidatureTexte + " ]" ;
    }

    public String getCandidatureTexte(){

        switch (etatCandidature) {

            case EN_ATTENTE:
                return "En attente" ;
            case ETUDIEE:
                return "Etudiée" ;
            
            case ANNULEE:
                return "Annulée" ;
            
            case ACCEPTEE:
                return "Acceptée" ;
            
            case REJETEE:
                return "Rejetée" ;

            default:
                return "Inexistant" ;
        }
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDateDeDepot() {
        return dateDeDepot;
    }

    public void setDateDeDepot(LocalDate dateDeDepot) {
        this.dateDeDepot = dateDeDepot;
    }

    public LocalDate getDateDeReponse() {
        return dateDeReponse;
    }

    public void setDateDeReponse(LocalDate dateDeReponse) {
        this.dateDeReponse = dateDeReponse;
    }

    public int getEtatCandidature() {
        return etatCandidature;
    }

    public void setEtatCandidature(int etatCandidature) {
        this.etatCandidature = etatCandidature;
    }

    

}
