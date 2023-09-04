package org.example;

import java.util.ArrayList;
import java.util.List;

public class GroupeEleves {
    private Eleve eleve;
    private List<Eleve> listeEleves;

    public GroupeEleves(){

        listeEleves = new ArrayList<>();
    }

    public int nombre() {
        return listeEleves.size();
    }

    public ArrayList<Eleve> getListe(){
        return (ArrayList<Eleve>) listeEleves;
    }

    public void ajouterEleve(Eleve eleve){
        listeEleves.add(eleve);
    }

    public Eleve chercher(String nom){
        for (Eleve eleve : listeEleves){
            if (eleve.getNom().toLowerCase().contains(nom.toLowerCase())){
                return eleve;
            }
        }
        return null;
    }

    public void lister() {
        for (Eleve eleve : listeEleves){
            System.out.println(eleve.toString());
        }
    }
}
