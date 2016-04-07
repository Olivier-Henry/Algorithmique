/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fonctions;

import java.util.GregorianCalendar;

/**
 *
 * @author formation
 */
public class De1900AAujourdhui {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        int anneeEnCours = today.get(GregorianCalendar.YEAR);
        for (int i = 1900; i<= anneeEnCours; i++){
            System.out.println(i);
        }
    }
}
