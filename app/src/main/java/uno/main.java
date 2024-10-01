package uno;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Classe principale pour démarrer le jeu Uno.
 */
public class main {
    public static void main(String[] args) {
        UnoGame jeu = new UnoGame();
        while (!jeu.isGameFinished()) {
            jeu.tourJoueur();
        }
    }
}
