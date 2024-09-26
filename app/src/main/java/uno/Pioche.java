package uno;

import java.util.LinkedList;
import java.util.List;

public class Pioche {
    private List<Carte> cartes;

    public Pioche() {
        cartes = new LinkedList<>();
    }

    public void ajouterCarte(Carte carte) {
        cartes.add(carte);
    }

    public Carte getCarteEnJeu() {
        if (!cartes.isEmpty()) {
            return cartes.get(cartes.size() - 1);
        }
        return null;
    }

    public void melanger() {
    }
}