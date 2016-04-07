/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaines;

/**
 *
 * @author formation
 */
public class Left {

    public static void main(String[] args) {

        //Initialisation des variables
        String chaine = "Azerty", nChaine = "";
        String[] tChaine = chaine.split("");
        int n = 7;

        //Traitement
        if (tChaine.length > n || tChaine.length < n) {

            for (int i = 0; i < 3; i++) {
                nChaine += tChaine[i];
            }
            chaine = nChaine;
            //Affichage
            System.out.println(chaine);

        } else {
            System.err.println("Erreur du nombre de carateres");
        }

    }

}
