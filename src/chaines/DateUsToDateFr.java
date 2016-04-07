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
public class DateUsToDateFr {

    public static void main(String[] args) {

        String dateFr = "2016-02-23";
        String tDate[] = dateFr.split("-");
        dateFr = "";
        for (int i = tDate.length-1; i >= 0; i--) {
            dateFr += tDate[i];  
            if(i!=0){
                dateFr += "-";
            }
        }
        
        System.out.println(dateFr);
    }

}
