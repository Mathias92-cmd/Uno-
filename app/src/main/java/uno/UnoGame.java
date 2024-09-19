package uno;

import java.util.Scanner;

public class UnoGame {
    private Joueur joueurCourant;
    private Deck deck;
    private Pioche piocheJetable;


    public UnoGame() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez le nom du joueur: ");
            String nomJoueur = scanner.nextLine();
            this.joueurCourant = new Joueur(nomJoueur);
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
            System.out.println("Fin de la partie");
        }
    }
}
