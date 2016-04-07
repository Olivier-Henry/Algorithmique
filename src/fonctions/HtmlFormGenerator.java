/*
    Tableau Ordinal Vers HTML
    un tableau des labels { Pseudo, Mot de Passe)
    un tableau des noms { pseudo, mdp, table }

 */

package fonctions;

/**
 *
 * @author formation
 */
public class HtmlFormGenerator {
    
    
    public static String input(String[] labels, String[] names){
       String r = "<form action=\"#\" method=\"get\" >\n";
           
       for(int i = 0; i< labels.length;i++){
           
           r += "<label for='"+names[i]+"'>"+labels[i]+"</label>\n";
           r += "<input type='text' name='"+names[i]+"'>\n";
    
       }
       
       for(int i = labels.length; i<names.length; i++){
           r += "<input type='hidden' name='"+names[i]+"' value='"+names[i]+"'>\n";
       }
       
       r += "<input type='submit' value='submit'>\n";
       r += "</form>";
       return r;
    }
    
    public static void main(String[] args) {
        String[] names = {"pseudo", "mdp", "user"};
        String[] labels = {"Pseudo :", "Mot de passe :"};
        System.out.println(input(labels, names));
    }
    
}
