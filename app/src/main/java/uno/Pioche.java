package uno;

import java.util.List;

public class Pioche {

    private static List<Carte> cartes;

    private static Carte carteEnJeu;

    private static UnoGame unoGame;

    public static void ajouterCarte(Carte carte) {
        int nbCarteADistribuer = 7 * unoGame.getNbJoueurs();
        cartes.add(carte);
        carteEnJeu = carte;
        System.out.println("Nombre de cartes restantes: " + (cartes.size() - nbCarteADistribuer));
    }

    public static Carte getCarteEnJeu() {
        return carteEnJeu;
    }
}
