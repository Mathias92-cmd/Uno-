package uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pioche {

    private static List<Carte> cartes;
    private static Carte carteEnJeu;

    public Pioche() {
        cartes = new ArrayList<>();
    }

    public static void ajouterCarte(Carte carte) {
        cartes.add(carte);
    }

    public Carte piocherCarte() {
        if (!cartes.isEmpty()) {
            return cartes.removeFirst();
        }
        System.out.println("La pioche est vide !");
        return null;
    }

    public void melanger() {
        Collections.shuffle(cartes);
    }

    public int getTaille() {
        return cartes.size();
    }

    public static Carte getCarteEnJeu() {
        return carteEnJeu;
    }

    public void setCarteEnJeu(Carte carteEnJeu) {
        this.carteEnJeu = carteEnJeu;
    }
}