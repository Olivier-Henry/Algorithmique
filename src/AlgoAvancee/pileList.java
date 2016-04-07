/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AlgoAvancee;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author formation
 */
public class pileList {
    
    private List<String> pile;
    
    public pileList(){
        this.pile = new ArrayList();
    }

    public pileList(List pile) {
        this.pile = pile;
    }
    
    public String ajouterDansPile(String s){
        this.pile.add(s);
        return "L'objet "+ s +" a été ajouté !";
    }
    
    public String supprimerDePile(){
        String s = "L'objet "+ this.pile.get(this.pile.size()-1) +" a été supprimé !";
        this.pile.remove(this.pile.size()-1);
        return s;
    }
    
    public String recupererValeur(){
       return this.pile.get(this.pile.size()-1);
    }
    
    public int recupererLongueur(){
        return this.pile.size();
    }
    
//    public void printDebugList(){
//        System.out.println(this.pile);
//    }

    public List getPile() {
        return pile;
    }

    public void setPile(List pile) {
        this.pile = pile;
    }
    
    
    
    public static void main(String[] args) {
        pileList pl = new pileList();
        System.out.println(pl.ajouterDansPile("hello"));
        System.out.println(pl.ajouterDansPile("Test 1"));
        System.out.println(pl.recupererValeur());
        System.out.println(pl.recupererLongueur());
        System.out.println(pl.supprimerDePile());
        System.out.println(pl.recupererValeur());
        
       
    }
    
}

