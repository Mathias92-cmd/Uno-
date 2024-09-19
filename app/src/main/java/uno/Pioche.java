package uno;

import java.util.List;

public class Pioche {

    private List<Carte> cartes;

    private UnoGame unoGame;

    public void ajouterCarte(Carte carte) {
        int nbCarteADistribuer = 7 * unoGame.getNbJoueurs();
        cartes.add(carte);
        System.out.println("Nombre de cartes restantes: " + (cartes.size() - nbCarteADistribuer));
    }

    public Carte getDerniereCarte() {

    }
}
