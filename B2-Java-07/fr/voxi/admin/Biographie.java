package fr.voxi.admin;

public class Biographie extends Oeuvre {

    private String personnageHistorique ;

    public Biographie(int numero, String titre, int nbAudioBooks, String personnageHistorique) {
        super(numero, titre, nbAudioBooks);
        this.personnageHistorique = personnageHistorique ;
    }

    @Override
    public String toHtml() {
        if (getAudioBooks() < nbAudioBookMax) {
            return "<div>" + getNumero() + " (" + getAudioBooks() + " produits)<br>" + personnageHistorique + "<br>" + getTitre() + "</div>";
        } else {
            return "<div>" + getNumero() + " (<strong>Production bloquée</strong>)<br>" + personnageHistorique + "<br>" + getTitre() + "</div>";
        }
    }

    @Override
    public String toString() {
        return "Biographie [personnageHistorique=" + personnageHistorique + "]";
    }

    public String getPersonnageHistorique() {
        return personnageHistorique;
    }

    public void setPersonnageHistorique(String personnageHistorique) {
        this.personnageHistorique = personnageHistorique;
    }

}
