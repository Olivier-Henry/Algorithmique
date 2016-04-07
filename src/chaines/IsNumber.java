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
public class IsNumber {
    
    public static void main(String[] args) {
       
       String chaine = "1245631258a7109";
       boolean isOk = true;
       int i = 0;
       while(i<chaine.length() && isOk){
           if(chaine.charAt(i) > '9' || chaine.charAt(i)< '0'){
               isOk = false;
           }
           i++;
       }
       
       if(isOk){
           System.out.println("La chaine est Ok");
       }else{
           System.err.println("La chaine n'est pas ok");
       }
       
        
    }
    
}
