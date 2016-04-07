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
public class UseCrudGenerator {
    
    public static void main(String[] args) {
        CrudGenerator crud = new CrudGenerator("http://www.google.fr/index?login=olivier&password=hello");
        System.out.println(crud.getSelectOne());
        System.out.println(crud.getSelectAll());
        System.out.println(crud.getInsert());
        System.out.println(crud.getDelete());
        System.out.println(crud.getUpdate());
    }
    
}
