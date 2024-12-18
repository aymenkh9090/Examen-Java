package iteam.tn;

public class Joueur {

    private int id ;
    private String nom;
    private String nationalité;
    private double salaire;

    public Joueur(){

    }

    public Joueur(int id , String nom , String nationalité , double salaire){
        this.id=id;
        this.nom=nom;
        this.nationalité=nationalité;
        this.salaire=salaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNationalité() {
        return nationalité;
    }

    public void setNationalité(String nationalité) {
        this.nationalité = nationalité;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString(){
        return "Joueur {"+"id="+id+"nom="+nom+"nationalite="+nationalité+"salaire="+salaire;
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null)
        return false;
        if(obj instanceof Joueur){
            final Joueur other = (Joueur) obj;
            return this.id != other.id;
        }

        return false;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        return hash;
    }













}
