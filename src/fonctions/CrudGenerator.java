/*
 * Classe qui traite une url pour en extraire des requetes crud
 * SELECT, SELECT ALL, INSERT, DELETE, UPDATE
 */
package fonctions;

import java.nio.file.Files;
import java.util.Map;

/**
 *
 * @author Olivier
 */
public class CrudGenerator {

    private String urlToCut;
    private String tableName;
    private StringBuilder selectOne;
    private StringBuilder update;
    private StringBuilder selectAll;
    private StringBuilder insert;
    private StringBuilder delete;
    private String[] tColonnes;
    private String[] tValeurs;

    public CrudGenerator(String url) {
        //initialisation
        this.urlToCut = url;
        this.tableName = "user";
        this.selectOne = new StringBuilder();
        this.update = new StringBuilder();
        this.selectAll = new StringBuilder();
        this.insert = new StringBuilder();
        this.delete = new StringBuilder();

        //Créer 2 string builders pour stocker les valeurs et colonnes
        StringBuilder sbColonnes = new StringBuilder();
        StringBuilder sbValeurs = new StringBuilder();

        //Dans le constructeur nous faisons le découpage de l'url pour les mettre dans les tableaux tColonnes et tValeurs
        String[] tDecoupe = url.split("\\?");
        tDecoupe = tDecoupe[1].split("&");

        for (int i = 0; i < tDecoupe.length; i++) {
            sbColonnes.append(tDecoupe[i].split("=")[0]);
            sbColonnes.append("-");
            sbValeurs.append(tDecoupe[i].split("=")[i]);
            sbValeurs.append("-");
        }

        //on nettoie les stringbuilders des tirets en trop    
        sbValeurs.deleteCharAt(sbValeurs.lastIndexOf("-"));
        sbColonnes.deleteCharAt(sbColonnes.lastIndexOf("-"));

        //on split les stringBuilders en tableaux
        this.tColonnes = sbColonnes.toString().split("-");
        this.tValeurs = sbValeurs.toString().split("-");

        //on génère les requetes
        this.generateSelectOne();
        this.generateSelectAll();
        this.generateInsert();
        this.generateDelete();
        this.generateUpdate();
    } /// end constructor

    //Génération de la requête delete
    private void generateDelete() {
        this.delete.append("DELETE FROM ");
        this.delete.append(this.tableName);
        //Ajout de la clause Where
        this.delete = generateWhere(this.delete);
    }
    
    public static String generateDelete(Map<String, String> map){
        String retour = "";
        return retour;
    }

    //Génération de la requete update
    private void generateUpdate() {
        //Construction de la requete
        this.update.append("UPDATE ");
        this.update.append(tableName);
        this.update.append(" SET ");
        for (int i = 0; i < tColonnes.length; i++) {
            this.update.append(tColonnes[i]);
            this.update.append("='");
            this.update.append(tValeurs[i]);
            this.update.append("',");
        }
        //Nettoyage et ajout de la clause Where
        this.update.deleteCharAt(this.update.lastIndexOf(","));
        this.update = generateWhere(this.update);
    }

    private void generateInsert() {
        //On construit la requête
        this.insert.append("INSERT INTO ");
        this.insert.append(this.tableName);
        this.insert.append("(");
        for (int i = 0; i < this.tColonnes.length; i++) {
            this.insert.append(this.tColonnes[i]);
            this.insert.append(",");
        }
        //Nettoyage
        this.insert.deleteCharAt(this.insert.lastIndexOf(","));

        //On continues en ajoutant les values
        this.insert.append(") VALUES(");
        for (int i = 0; i < this.tValeurs.length; i++) {
            this.insert.append("'");
            this.insert.append(tValeurs[i]);
            this.insert.append("',");
        }

        //Nettoyage
        this.insert.deleteCharAt(this.insert.lastIndexOf(","));
        this.insert.append(")");

    }

    //Génération de la clause selectAll
    private void generateSelectAll() {
        this.selectAll.append("SELECT ");
        for (String colonne : tColonnes) {
            this.selectAll.append(colonne);
            this.selectAll.append(",");
        }
        //Nettoyage
        this.selectAll.deleteCharAt(this.selectAll.lastIndexOf(","));
        //Ajout de la clause FROM et du nom de la table
        this.selectAll.append(" FROM ");
        this.selectAll.append(this.tableName);
    }

    //génération du selectOne
    private void generateSelectOne() {
        this.selectOne.append("SELECT * FROM ");
        this.selectOne.append(this.tableName);
        //Ajout de la clause Where
        this.selectOne = generateWhere(this.selectOne);
    }

    //Function pour générer le WHERE
    private StringBuilder generateWhere(StringBuilder sbWhere) {
        sbWhere.append(" WHERE ");
        for (int i = 0; i < tColonnes.length; i++) {
            sbWhere.append(tColonnes[i]);
            sbWhere.append("='");
            sbWhere.append(tValeurs[i]);
            sbWhere.append("' AND ");
        }

        //Nettoyage
        sbWhere.delete(sbWhere.length() - 5, sbWhere.length());

        //Retour
        return sbWhere;
    }

    private String getUrlToCut() {
        return urlToCut;
    }

    public StringBuilder getSelectOne() {
        return selectOne;
    }

    public StringBuilder getUpdate() {
        return update;
    }

    public StringBuilder getSelectAll() {
        return selectAll;
    }

    public StringBuilder getInsert() {
        return insert;
    }

    public StringBuilder getDelete() {
        return delete;
    }

    private String[] gettColonnes() {
        return tColonnes;
    }

    private String[] gettValeurs() {
        return tValeurs;
    }

}
