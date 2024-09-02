package fr.voxi.admin;

public class Lecteur extends Membre {
    
    private String langueMaternelle ;
    private int maitrise ;
    
    public Lecteur(int numero, String nom, String mail, String langueMaternelle, int maitrise) {
        super(numero, nom, mail);
        this.langueMaternelle = langueMaternelle;
        this.maitrise = maitrise;
    }

    @Override
    public String toString() {

        String maitriseTrad ;

        switch (maitrise) {

            case 1:
                maitriseTrad = "Débutant" ;
                break;
            
            case 2:
                maitriseTrad = "Avancée" ;
                break;

            case 3:
                maitriseTrad = "Intermédiaire" ;
                break;

            case 4:
                maitriseTrad = "Très avancée" ;
                break;

            case 5:
                maitriseTrad = "Expert" ;
                break;

            default:
                maitriseTrad = "Maîtrise incorrecte";
        }

        return "Lecteur [langueMaternelle=" + langueMaternelle + ", maitrise=" + maitriseTrad + "]";
    }

    @Override
    public String toHtml(){
        return "<span id=" + getNumero() + " " + "class=\"lecteur\"> " + getNom() + " (<em>" + langueMaternelle + "</em>) </span>" ;
    }

    public String toHtml(int mode){

        switch (mode) {

            case 1:

                String maitriseTrad ;
                switch (maitrise) {

                    case 1:
                        maitriseTrad = "Débutant" ;
                        break;
                    
                    case 2:
                        maitriseTrad = "Avancée" ;
                        break;
        
                    case 3:
                        maitriseTrad = "Intermédiaire" ;
                        break;
        
                    case 4:
                        maitriseTrad = "Très avancée" ;
                        break;
        
                    case 5:
                        maitriseTrad = "Expert" ;
                        break;
        
                    default:
                        maitriseTrad = "Maîtrise incorrecte";
                }

                return "<div id="+ "\"" + getNumero() + "\" " + "class=\"lecteur\"> " + getNom() + " <br/>" + "Degré de maîtrise : " + maitriseTrad + " </div>" ;
            
            case 2:

                return "<div id="+ "\"" + getNumero() + "\" " + "class=\"lecteur\"> " + getNom() + " <br/>" + "Langue maternelle : " + getLangueMaternelle() + " </div>" ;

            case 3:

                switch (maitrise) {

                    case 1:
                        maitriseTrad = "Débutant" ;
                        break;
                    
                    case 2:
                        maitriseTrad = "Avancée" ;
                        break;
        
                    case 3:
                        maitriseTrad = "Intermédiaire" ;
                        break;
        
                    case 4:
                        maitriseTrad = "Très avancée" ;
                        break;
        
                    case 5:
                        maitriseTrad = "Expert" ;
                        break;
        
                    default:
                        maitriseTrad = "Maîtrise incorrecte";
                }

                return "<div id="+ "\"" + getNumero() + "\" " + "class=\"lecteur\"> " + getNom() + " <br/>" + "Degré de maîtrise : " + maitriseTrad + " <br/> " + "Préférence : " + getLangueMaternelle() ;

            default:
                return "Erreur ! Vous devez entrer en paramètre un int entre 1 et 3 !" ;
        }
    }

    public String getLangueMaternelle() {
        return langueMaternelle;
    }

    public void setLangueMaternelle(String langueMaternelle) {
        this.langueMaternelle = langueMaternelle;
    }

    public int getMaitrise() {
        return maitrise;
    }

    public void setMaitrise(int maitrise) {
        this.maitrise = maitrise;
    }

}
