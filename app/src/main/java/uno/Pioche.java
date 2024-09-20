package uno;

import java.util.List;

public class Pioche {

    private List<Carte> cartes;

    private Carte carteEnJeu;

    private UnoGame unoGame;

    public void ajouterCarte(Carte carte) {
        int nbCarteADistribuer = 7 * unoGame.getNbJoueurs();
        cartes.add(carte);
        carteEnJeu = carte;
        System.out.println("Nombre de cartes restantes: " + (cartes.size() - nbCarteADistribuer));
    }

    public Carte getCarteEnJeu() {
        return carteEnJeu;
    }
}
