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
public class Right {

    public static void main(String[] args) {
        String chaine = "ceci est une chaine";
        String nChaine = "";
        int nbCar = 4;

        if (chaine.length() > nbCar) {
            for (int i = chaine.length() - nbCar; i < chaine.length(); i++) {
                nChaine += chaine.charAt(i);
            }
            System.out.println(nChaine);
        } else {
            System.out.println(chaine);
        }
    }

}
