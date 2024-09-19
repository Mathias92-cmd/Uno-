package uno;

import java.util.ArrayList;
import java.util.Scanner;

public class UnoGame {
    private Joueur joueurCourant;
    private Deck deck;
    private Pioche piocheJetable;
    ArrayList<Joueur> joueurs = new ArrayList<>();
    private int indexJoueurCourant;

    public int getIndexJoueurCourant() {
        return indexJoueurCourant;
    }

    public UnoGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de joueurs: ");
        int nombreJoueurs = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nombreJoueurs; i++) {
            System.out.print("Entrez le nom du joueur " + (i + 1) + ": ");
            String nomJoueur = scanner.nextLine();
            joueurs.add(new Joueur(nomJoueur));
        }
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
        if(joueurCourant.getNombreCartes() == 0){
            System.out.println("Le joueur " + joueurCourant.getNomJoueur() + " a gagné !");
        }
    }
}
