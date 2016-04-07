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
public class MajPremier {

    public static void main(String[] args) {
        
        //Initialisation
        String chaine = "AZERTY";
        
        if(!chaine.isEmpty()){
            String lettre = chaine.substring(0, 1);
            String reste = chaine.substring(1);
            chaine = lettre.toUpperCase();
            chaine += reste.toLowerCase();
             //Affichage
            System.out.println(chaine);
        }else{
            System.err.println("La chaîne est vide");
        }
        
       
    }///main

}///class MajPremier
