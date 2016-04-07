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
public class UnderscoreToCamel {

    public static void main(String[] args) {

        String chaine = "Nom_du_client";
        String[] tChaine = chaine.split("_");
        chaine= tChaine[0].toLowerCase();
        for (int i = 1; i < tChaine.length; i++) {
            
            chaine +=  tChaine[i].substring(0, 1).toUpperCase();
            chaine +=  tChaine[i].substring(1).toLowerCase();
        }
        
        System.out.println(chaine);

    }

}
