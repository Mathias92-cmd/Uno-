package uno;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {
    private List<Carte> cartes;

    public Deck() {
        cartes = new LinkedList<>();
    }

    public void melanger() {
        Collections.shuffle(cartes);
    }

    public Carte piocherCarte() {
        if (!cartes.isEmpty()) {
            return cartes.remove(0);
        }
        System.out.println("La pioche est vide !");
        return null;
    }
}