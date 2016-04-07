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
public class DateEnLettres {
    
    public static void main(String[] args) {
        
        String[] mois = {"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Décembre"};
        GregorianCalendar today = new GregorianCalendar();
        System.out.println(today.get(GregorianCalendar.DAY_OF_MONTH)+" "+mois[today.get(GregorianCalendar.MONTH)]+" "+today.get(GregorianCalendar.YEAR));
    }   
    
}
