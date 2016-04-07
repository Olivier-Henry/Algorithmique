/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonctions;

/**
 *
 * @author formation
 */
public class Arithmetic {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int soustraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static Boolean strIsNumber(String str){
       String chaine = str;
       boolean isOk = true;
       int i = 0;
       while(i<chaine.length() && isOk){
           if(chaine.charAt(i) > '9' || chaine.charAt(i)< '0'){
               isOk = false;
           }
           i++;
       }
      
        return isOk;
    }
    
    public static void main(String[] args) {
        int x, y, r;
        x = 3000;
        y = 1000;
        r = addition(x, y);

        System.out.println(r);

        System.out.println(addition(1, 9));

        if (addition(1, 3) == 4) {
            System.out.println("OK");
        }

        System.out.println("Multiplication " + x + " et " + y + " = " + multiplication(x, y));
        System.out.println("Division " + x + " et " + y + " = " + division(x, y));
        System.out.println("Soustraction " + x + " et " + y + " = " + soustraction(x, y));
        System.out.println("Chaine est un nombre :"+ strIsNumber("9525684123")); 
    }

}
