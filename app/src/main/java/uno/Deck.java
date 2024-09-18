package uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Carte> deck;

    public Deck() {
        List<Carte> deck = new ArrayList<Carte>();
    }

    public Carte piocherCarte() {

    }

    public void melanger() {
        Collections.shuffle(deck);
    }
}
