/*
 Générer les requetes SELECT (ONE et ALL), INSERT, DELETE, UPDATE
 A partir d'une URL comme http://www.google.fr/user.php?pseudo=olivier&password=hello
 */
package fonctions;

/**
 *
 * @author formation
 */
public class DbCrudGenerator {

    //Retourne un tableau avec les paires à traiter ex: {pseudo=olivier, password=hello}
    public static String[] tableauPaires(String s) {
        return s.split("&");
    }

    //Coupe l'url initiale en deux au niveau du ? et retourne la seconde partie
    public static String cutUrl(String url) {
        return url.split("\\?")[1];
    }

    //Retourne La requete SELECT
    public static String selectOne(String[] tColonnesValeurs, String tableName) {
        String select = "SELECT * FROM " + tableName + " WHERE ";

        //traitement par tableau contenant la valeur name=value
        for (int i = 0; i < tColonnesValeurs.length; i++) {
            String[] tColonneValeur = tColonnesValeurs[i].split("=");
            select += tColonneValeur[0];
            select += "='";
            select += tColonneValeur[1];
            select += "' AND ";

        }
        select = select.substring(0, select.length() - 4);
        return select;
    }

    //Retourne la requete INSERT
    public static String insert(String[] tColonnesValeurs, String tableName) {
        String values = "";
        String insert = "INSERT INTO " + tableName + "(";
        for (int i = 0; i < tColonnesValeurs.length; i++) {
            String[] tColonneValeur = tColonnesValeurs[i].split("=");
            insert += tColonneValeur[0];
            insert += ",";
            values += "'";
            values += tColonneValeur[1];
            values += "',";
        }

        insert = insert.substring(0, insert.length() - 1);
        values = values.substring(0, values.length() - 1);

        insert += ") VALUES(" + values;
        insert += ")";

        
        return insert;
    }

    //Retourne la requete UPDATE
    //
    //Retourne la requete DELETE
    //
    //Retourne la requete SELECT ALL
    public static String selectAll(String tableName) {
        return "SELECT * FROM " + tableName + ";";
    }

    public static void main(String[] args) {
        String url = "http://www.google.fr/user.php?pseudo=olivier&password=hello&test=t";
        String[] paires;

        url = cutUrl(url);
        
        
        System.out.println(url);
        paires = tableauPaires(url);
        System.out.println(selectAll("user"));
        System.out.println(selectOne(paires, "user"));
        System.out.println(insert(paires, "user"));
    }
}
