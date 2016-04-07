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
public class Dates {
    
    
    
    public static void main(String[] args) {
                int jour, mois, annee;

        // Aujourd'hui
        GregorianCalendar aujourdhui = new GregorianCalendar();
        jour = aujourdhui.get(GregorianCalendar.DAY_OF_MONTH);
        mois = aujourdhui.get(GregorianCalendar.MONTH) + 1;
        annee = aujourdhui.get(GregorianCalendar.YEAR);
        System.out.println("*** Aujourd'hui ***");
        System.out.println(jour + "/" + mois + "/" + annee);

        // Une autre date
        GregorianCalendar un14juillet = new GregorianCalendar(2016, 6, 14);
        jour = un14juillet.get(GregorianCalendar.DAY_OF_MONTH);
        mois = un14juillet.get(GregorianCalendar.MONTH) + 1;
        annee = un14juillet.get(GregorianCalendar.YEAR);
        System.out.println("*** Un 14 juillet ***");
        System.out.println(jour + "/" + mois + "/" + annee);

        System.out.println("*** Année bissextile ? ***");
        System.out.println(un14juillet.isLeapYear(un14juillet.get(GregorianCalendar.YEAR))?"Oui" : "Non");
    }
    
}
