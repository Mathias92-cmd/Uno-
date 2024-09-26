package uno;

public class main {
    public static void main(String[] args) {
        UnoGame jeu = new UnoGame();
        while (!jeu.isGameFinished()) {
            jeu.tourJoueur();
        }
    }
}
