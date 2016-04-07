/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conditionelles;

/**
 *
 * @author formation
 */
public class If1 {

    // --- Principale
    public static void main(String[] args) {

        // Declaration des variables
        int age;
        String etat;

        // --- IN
        age = 32;

        // --- TRAITEMENT
        if (age < 18) {
            etat = "Mineur";
        }
        else {
            etat = "Majeur";
        }

        // --- OUT
        System.out.println("Etat : " + etat);

    } /// main

} /// class IF1

