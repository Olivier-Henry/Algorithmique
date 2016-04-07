/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursivite;

/**
 *
 * @author formation
 */
public class calculPuissanceRecursive {
    
    //Calcul de la puissance avec une fonction recursive
    public static long produit(long n, long p){
      
        
        if(p > 0){
            p--;
            return n * produit(n,p);
            
        }else{
            return 1;
        }
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(produit(10,10));
    }
}
