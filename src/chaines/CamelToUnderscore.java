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
public class CamelToUnderscore {
        
    public static void main(String[] args) {
        
        // Déclaration des variables
        String chaine = "NomDuClient";
        String nChaine = "";
        nChaine += chaine.charAt(0);
        
        //traitement des Lettres majuscules
        //départ de la boucle à 1 pour éviter d'underscoriser le premier mot 
        for(int i=1;i<chaine.length();i++){
            //La lettre en cours est inférieure à Z et supérieure à A
            if(chaine.charAt(i)> 'A' && chaine.charAt(i) <  'Z'){
                nChaine += "_";
            }
            
            nChaine += chaine.charAt(i);
        
        }
        //mise en minuscule
       nChaine = nChaine.toLowerCase();
        
       System.out.println(nChaine);
        
    }
}
