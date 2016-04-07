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
public class ControleCP {
    
    public static void main(String[] args) {
        
        // Initialisation
        String cp = "92220";
        int longueur = cp.length();
        
        
        //Calcul et affichage
        if(longueur == 5){
            
            System.out.println("La longueur est OK");
        
        }else {
            System.out.println("La longueur n'est pas Ok");
            
            if(longueur > 5){
                System.out.println("Trop long");
            }else if(longueur < 5){
                System.out.println("Trop court");
            }
            
        }
            
            
            
            
      
    } ///main
  
}///class
