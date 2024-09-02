package fr.voxi.admin;

import java.time.LocalDate;
import java.time.Period;

public class Abonnement {

    private int numero ;
    private LocalDate dateSouscription ;

    private static Period dureeAbonnement = Period.ofMonths(3);

    Abonnement(int numero, LocalDate dateSouscription){
        this.numero = numero ;
        this.dateSouscription = dateSouscription ;
    }

    @Override
    public String toString(){
        return "[ Numéro : " + numero + ", Date de souscription : " + dateSouscription +  " ]";
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public LocalDate getDateSouscription() {
        return dateSouscription;
    }
    public void setDateSouscription(LocalDate dateSouscription) {
        this.dateSouscription = dateSouscription;
    }

    public static Period getDureeAbonnement() {
        return dureeAbonnement;
    }

    public static void setDureeAbonnement(int i) {
        Abonnement.dureeAbonnement = Period.ofMonths(i);
    }

}
