package org.example;

import java.util.ArrayList;
import java.util.List;

public class Eleve {

    private static  int compteur =0;
    private int numOrdre;
    private String nom;
    private List<Integer> listeNotes;
    private double moyenne;

    public Eleve(String nom) {
        this.numOrdre = compteur++;
        this.nom = nom;
        this.listeNotes = new ArrayList<>();
        this.moyenne=0.0;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public String getNom() {
        return nom;
    }

    public List<Integer> getListeNotes() {
        return listeNotes;
    }

    public void ajouterNote(int note){
        if (note<0){
            note=0;
        }else if (note>20){
            note = 20;
        }

        listeNotes.add(note);

        int nombreDesNotes = listeNotes.size();
        double sommeDesNotes = 0.0;
        for (int n : listeNotes){
            sommeDesNotes += n;
        }
        moyenne = sommeDesNotes/nombreDesNotes;
    }

    @Override
    public String toString() {
        return "Eleve{" + "'"+
                 nom + "(" +
                 moyenne + ")"+ "'"+
        '}';
    }
}
