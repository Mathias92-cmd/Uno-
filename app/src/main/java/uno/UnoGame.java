package uno;

import java.util.ArrayList;
import java.util.Scanner;

public class UnoGame {
    private Joueur joueurCourant;
    private Deck deck;
    private Pioche piocheJetable;
    ArrayList<Joueur> joueurs = new ArrayList<>();
    private int indexJoueurCourant;
    private int nbJoueurs;

    public int getIndexJoueurCourant() {
        return indexJoueurCourant;
    }

    public UnoGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de joueurs: ");
        nbJoueurs = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nbJoueurs; i++) {
            System.out.print("Entrez le nom du joueur " + (i + 1) + ": ");
            String nomJoueur = scanner.nextLine();
            joueurs.add(new Joueur(nomJoueur));
        }
        this.nbJoueurs = nbJoueurs;
        this.indexJoueurCourant = 0;
        this.joueurCourant = joueurs.get(indexJoueurCourant);
        this.deck = new Deck();
        this.piocheJetable = new Pioche();
    }


    public void commencerPartie() {

    }

    public void tourJoueur() {

    }

    public void finDeLaPartie() {
        int joueursSansCartes = 0;
        for (Joueur joueur : joueurs) {
            if (joueur.getNombreCartes() == 0) {
                joueursSansCartes++;
            }
        }
        if (joueursSansCartes >= Math.min(2, nbJoueurs - 1)) {
            System.out.println("La partie est terminée !");
            System.exit(0); // Terminer le jeu
        } else {
            System.out.println("La partie continue.");
        }
    }
}
