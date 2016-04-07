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
public class Implode {
    
    public static void main(String[] args) {
        
        String t[] = {"A","Z","E","R","T","Y"};
        String chaine = "";
        
        for(int i=0; i<t.length;i++){
            chaine += t[i];
        }
        
        System.out.println(chaine);
    }
    
}
