/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonctions;

/**
 *
 * @author formation
 */
public class Chaines {

    public static String camelToUnderscore(String chaine) {
        // Déclaration des variables

        String nChaine = "";
        nChaine += chaine.charAt(0);

        //traitement des Lettres majuscules
        //départ de la boucle à 1 pour éviter d'underscoriser le premier mot 
        for (int i = 1; i < chaine.length(); i++) {
            //La lettre en cours est inférieure à Z et supérieure à A
            if (chaine.charAt(i) > 'A' && chaine.charAt(i) < 'Z') {
                nChaine += "_";
            }

            nChaine += chaine.charAt(i);

        }
        //mise en minuscule
        nChaine = nChaine.toLowerCase();

        return nChaine;
    }

    public static String underScoreToCamel(String chaine) {

        String[] tChaine = chaine.split("_");
        chaine = tChaine[0].toLowerCase();
        for (int i = 1; i < tChaine.length; i++) {

            chaine += tChaine[i].substring(0, 1).toUpperCase();
            chaine += tChaine[i].substring(1).toLowerCase();
        }
        return chaine;
    }

    public static String[] positionCaracteres(String ch, char charac) {
        //initialisation
        String[] positions;
        String cTemp = "";

        //recherche caractères et ajout des positions à une chaine ex: "1:7:9:16" 
        for (int i = 0; i < ch.length(); i++) {
            if (charac == ch.charAt(i)) {

                if (cTemp != "") {
                    cTemp += ":";
                }
                cTemp += i + 1;
            }
        }
        positions = cTemp.split(":");

        return positions;
    }
    

    public static void main(String[] args) {
        System.out.println(camelToUnderscore("UnderscoreYourTextEasily"));
        System.out.println(underScoreToCamel("camelise_your_text_easily"));
        
        
        //Affichage des positions
        String[] tab = positionCaracteres("je recherche les positions d'un caractère dans un texte", 'e');
        for (int i = 0; i < tab.length; i++) {
            System.out.println("*" + tab[i] + "*");
        }
    }

}
