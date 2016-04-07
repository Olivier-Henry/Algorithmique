/*
 * Calcul d'élévation à la puissance
 */
package boucleswhile;

/**
 *
 * @author formation
 */
public class ElevationPuissance {

    public static void main(String[] args) {

        //initialisation
        int nombre, puissance, r = 1;

        //Affectation des valeurs
        nombre = 2;
        puissance = 3;
        //Calcul
        if (nombre == 0 && puissance == 0) {
            r = 0;
        }else{
            while (puissance > 0) {
                r *= nombre;
                puissance--;
            }
        }
        System.out.println(r);
        System.out.println(Math.pow(3, 0));
    }

}
