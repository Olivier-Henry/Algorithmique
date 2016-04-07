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
public class ControleBissextile {
    
    public static void main(String[] args) {
      
        //Initialisation
        int annee = 2016;
        // Possiblité d'ajouter un booleen ici pour economiser un else
        //eg . Boolean biss = false;
        
        
        //calcul et résultats
        if(((annee % 4)==0 && (annee % 100)>0)||(annee % 400)==0){
            System.out.println("Année bissextile");
            //biss = true
        }else{
            //le else n'existe plus
            System.out.println("Année non bissextile");
        }
        
        //System.out.println(biss);
      
    }///main
   
}///class
