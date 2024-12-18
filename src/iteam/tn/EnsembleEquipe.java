package iteam.tn;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EnsembleEquipe {
    public Set<Equipe> equipes;
    public EnsembleEquipe(){
        equipes = new HashSet<>();
    }
    public Set<Equipe> getEquipes() {
        return equipes;
    }
    public void ajouterEquipe(Equipe equipe){
        equipes.add(equipe);
    }
    public void supprimeEquipe(Equipe equipe){
        equipes.remove(equipe);
    }
    public boolean rechercherEquipe(Equipe e){
        return equipes.stream()
                .anyMatch(eq->eq.equals(e));
    }
    public void afficherEquipe(){
        equipes.forEach(System.out::println);
    }
    public TreeSet<Equipe> trierParNom(){
        return equipes.stream()
                .collect(Collectors.toCollection(()->new TreeSet<>((e1,e2)->e1.getNom().compareTo(e2.getNom()))));
    }







}
