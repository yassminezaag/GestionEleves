package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Eleve eleve1 = new Eleve("Salma");
        Eleve eleve2 = new Eleve("Salim");
        Eleve eleve3 = new Eleve("Foued");

        eleve1.ajouterNote(20);
        eleve1.ajouterNote(7);
        eleve1.ajouterNote(25);

        eleve2.ajouterNote(17);
        eleve2.ajouterNote(20);
        eleve2.ajouterNote(9);

        eleve3.ajouterNote(14);
        eleve3.ajouterNote(17);
        eleve3.ajouterNote(3);

       // System.out.println(eleve1.toString());

        GroupeEleves groupeEleves = new GroupeEleves();

        groupeEleves.ajouterEleve(eleve1);
        groupeEleves.ajouterEleve(eleve2);
        groupeEleves.ajouterEleve(eleve3);

        int nombreDesEleves = groupeEleves.nombre();

       // System.out.println(nombreDesEleves);
        //groupeEleves.getListe();

       /* Eleve searchResult = groupeEleves.chercher("salma");
        if (searchResult != null){
            System.out.println(searchResult);
        } else
            System.out.println("Aucun élève avec ce nom ");

        */

        groupeEleves.lister();


    }
}