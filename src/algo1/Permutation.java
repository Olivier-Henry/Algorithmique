/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.oh.debut;

/**
 *
 * @author formation
 */
public class Permutation {
    
    public static void main(String[] args) {
        
        /*  Je peux ou doit ? déclarer de cette façon
            String choco, caf, temp; 
        */
        
        //Déclaration
        String choco = "Chocolat";
        String caf = "Café";
        String temp;
        
        //Calcul
        temp = choco;
        choco = caf;
        caf = temp;
        
        //Résultat
        System.out.println("Chocolat est devenu: "+choco);
        System.out.println("Café est devenu: "+caf);
    }
}
