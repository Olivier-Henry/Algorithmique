/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableaux;

/**
 *
 * @author formation
 */
public class SommeTableau {

    public static void main(String[] args) {

        int[] tableau = {5, 1, 3, 9, 7};
        int somme = 0;

        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }

        //comptage des elements
        System.out.println(tableau.length);

        //affichage somme des éléments tableau
        System.out.println(somme);

        //Calcul et affichage Moyenne
        int moyenne = somme / tableau.length;
        System.out.println(moyenne);

        // Affichage du plus petit nombre
        int min = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }
        System.out.println(min);

        //Affichage du plus grand nombre
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        System.out.println(max);

        //calcul de la variance
        //moyenne
        int variance = 0;
        for (int i = 0; i < tableau.length; i++) {
            int temp = tableau[i] - moyenne;
            variance += temp * temp;
        }
        variance = variance / tableau.length;
        System.out.println(variance);

        //Calcul/Affichage de l'écart type
        System.out.println(Math.sqrt(variance));

        //Recherche d'un nombre dans le tableau
        int nbrech = 9;
        int indextrouve = -1;

        for (int i = 0; i < tableau.length; i++) {
            if (nbrech == tableau[i]) {
                indextrouve = i;
            }
        }
        System.out.println(indextrouve);

        //recherche rapide d'un nombre dans un tabl
        boolean resultat = false;
        int rang = -2;
        int index = 0;
        while (index<tableau.length && !resultat) {
            
                if (nbrech == tableau[index]) {
                    resultat = true;
                    rang = index;
                }

            index++;
        }
        System.out.println("Elément trouvé : " + (rang+1));
    }
}
