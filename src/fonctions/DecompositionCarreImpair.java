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
public class DecompositionCarreImpair {

    public static void main(String[] args) {

        //Declaration et initialisation
        int nb = 25;
        int j = 0;
        
        //Calcul
        for (int i = 0; i < nb; i++) {
          j += (i*2)+1;
        }
    
        System.out.println("Le total est :" + j);

    }

}
