/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonctions;

import java.time.Year;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author formation
 */
public class gererateSimpleCalendar {

    public static void printCalendar(int year) {
        //Déclaration
        Map<String, Integer> mois = getTabMonths(year);

        for (Map.Entry<String, Integer> entry : mois.entrySet()) {
            System.out.print(entry.getKey() + "|");
            for (int i = 1; i <= entry.getValue(); i++) {
                System.out.print(i);
                System.out.print("|");
            }
            System.out.print("\n");
        }

    }

    public static Map<String, Integer> getTabMonths(int year) {

        Map<String, Integer> hmpMonths = new LinkedHashMap();

        hmpMonths.put("Janvier", 31);
        if (Year.isLeap(year)) {
            hmpMonths.put("Février", 29);
        } else {
            hmpMonths.put("Février", 28);
        }
        hmpMonths.put("Mars", 31);
        hmpMonths.put("Avril", 30);
        hmpMonths.put("Mai", 31);
        hmpMonths.put("Juin", 30);
        hmpMonths.put("Juillet", 31);
        hmpMonths.put("Aout", 31);
        hmpMonths.put("Septembre", 30);
        hmpMonths.put("Octobre", 31);
        hmpMonths.put("Novembre", 30);
        hmpMonths.put("Décembre", 31);

        return hmpMonths;
    }

    public static void main(String[] args) {
        printCalendar(2015);
    }
}
