package tableaux;

public class StatistiquesTableauV1 {

    public static void main(String[] args) {

        // Pour controler : http://fr.numberempire.com/statisticscalculator.php
        double[] t = {3, 2, 1, 6, 4};
        int compte;
        double somme = 0;
        double moyenne;
        double min;
        double max;
        double ecartMoyenne;
        double ecartMoyenneAucarre;
        double sommeDesEcartsCarres = 0;
        double variance;
        double ecartType;

        // Pour la recherche
        double valeurRecherchee = 3;
        int rang = -2;

        // Les TRT
        compte = t.length;
        System.out.println("Compte : " + compte);

        for (int i = 0; i < t.length; i++) {
            somme += t[i];
        }
        System.out.println("Somme : " + somme);

        moyenne = somme / compte;
        System.out.println("Moyenne : " + moyenne);

        min = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] < min) {
                min = t[i];
            }
        }
        System.out.println("Min : " + min);

        max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        System.out.println("Max : " + max);

        for (int i = 0; i < compte; i++) {
            ecartMoyenne = t[i] - moyenne;
            ecartMoyenneAucarre = ecartMoyenne * ecartMoyenne;
            sommeDesEcartsCarres += ecartMoyenneAucarre;
        }
        variance = sommeDesEcartsCarres / compte;

        System.out.println("Variance : " + variance);

        ecartType = Math.sqrt(variance);
        System.out.println("Ecart type : " + ecartType);

        // La recherche
        for (int i = 0; i < t.length; i++) {
            if (t[i] == valeurRecherchee) {
                rang = i;
            }
        }
        System.out.println("Rang : " + (rang + 1));

    }
}
