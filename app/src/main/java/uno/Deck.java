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
        if(!carte.estJouable()){
            System.out.println("Vous ne pouvez pas jouer cette carte !");
            piocherCarte();
        }
    }

    public void melanger() {
        Collections.shuffle(deck);
    }
}
