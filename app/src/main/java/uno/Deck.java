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
        if(!carte.estJouable())
    }

    public void melanger() {
        Collections.shuffle(deck);
    }
}
