package fr.voxi.admin;

    public class Personnage {
    
    private int age ;
    private String nom ;
    
    public Personnage(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Personnage [age=" + age + ", nom=" + nom + "]";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
