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
public class RemplacerCaractere {
    
    public static void main(String[] args) {
        
        //Initialisation
        String chaine = "la chaine de caractère ou le caractère devra être remplacé";
        String nChaine = "";
        char ancien = 'c';
        char nouveau = 'b';
        
        for(int i = 0; i<chaine.length();i++){
           if(chaine.charAt(i) == ancien){
               nChaine += nouveau;
           } else {
               nChaine += chaine.charAt(i);
           }
        }
        
        System.out.print(nChaine);
    }

}
