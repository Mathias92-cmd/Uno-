package uno;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class main {
    public static void main(String[] args) {
        UnoGame jeu = new UnoGame();
        while (!jeu.isGameFinished()) {
            jeu.tourJoueur();
        }
    }
}
