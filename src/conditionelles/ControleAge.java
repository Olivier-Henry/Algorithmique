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
public class ControleAge {
    
    public static void main(String[] args) {
        
        //init
        int age = 29;
        
        //calcul et affichage
        if(age >= 18){
            
            if(age > 130){
                System.out.println("L'age est trop vieux !");
            }else{
                System.out.println("Majeur");
            }
            
        }else{
            
            if(age<0){
                System.out.println("L'age est impossible en dessous de 0 !");
            }else{
                System.out.println("Mineur");
            }
            
        }
    } /// main
    
} /// class
