package uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Carte> deck;
    private Carte carte;

    public Deck() {
        List<Carte> deck = new ArrayList<Carte>();
    }

    public Carte piocherCarte() {
        while (!deck.isEmpty()) {
            Carte carte = deck.removeFirst();
            if (carte.estJouable()) {
                return carte;
            } else {
                System.out.println("Vous ne pouvez pas jouer cette carte !");
            }
        }
        System.out.println("Le deck est vide !");
        return null;
    }

    public void melanger() {
        Collections.shuffle(deck);
    }
}
