package iteam.tn;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Equipe {

    private int id;
    private String nom;
    private String pays;
    private List<Joueur> joueurs;

    public Equipe() {
    }

    public Equipe(int id, String nom, String pays, List<Joueur> joueurs) {
        this.id = id;
        this.nom = nom;
        this.pays = pays;
        this.joueurs = joueurs;
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

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    @Override
    public String toString(){
        return "Equipe {"+ "id=" + id + "nom=" + nom + "pays=" + pays + "joueurs=" + joueurs + "}";
    }


    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(obj instanceof Equipe){
            final Equipe other = (Equipe) obj;
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

    public void addJoueur(Joueur j){
        joueurs.add(j);
    }
    public void supprimerJoueur(Joueur j){
        joueurs.remove(j);
    }
    public boolean rechercherJoueurParNationalite(String nationalité){

       return joueurs.stream()
                .anyMatch(j->j.getNationalité().equals(nationalité));
    }

    public Map<String , List<Joueur>> regrouperParNationalite(){
        return joueurs.stream()
                .collect(Collectors.groupingBy(Joueur::getNationalité));
    }




















}
