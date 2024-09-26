package uno;

import java.util.ArrayList;
import java.util.Scanner;

public class UnoGame {

    Scanner scanner = new Scanner(System.in);
    private Joueur joueurCourant;
    private Deck deck;
    private Pioche piocheJetable;
    ArrayList<Joueur> joueurs = new ArrayList<>();
    private int indexJoueurCourant;
    private int nbJoueurs;
    private boolean gameFinished;
    private boolean inverserSens;

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
        this.indexJoueurCourant = 0;
        gameFinished = false;
        this.joueurCourant = joueurs.get(indexJoueurCourant);
        this.deck = new Deck();
        this.piocheJetable = new Pioche();
        commencerPartie();
    }

    public void commencerPartie() {
        deck.melanger();
        try {
            for (int i = 0; i < 7; i++) {
                for (Joueur joueur : joueurs) {
                    Carte carte = deck.piocherCarte();
                    if (carte != null) {
                        joueur.piocherCarte(carte);
                    } else {
                        System.out.println("Pas assez de cartes dans le deck pour distribuer.");
                        gameFinished = true;
                        return;
                    }
                }
            }
            Carte premiereCarte = deck.piocherCarte();
            if (premiereCarte != null) {
                piocheJetable.ajouterCarte(premiereCarte);
                piocheJetable.melanger();
            } else {
                System.out.println("Pas de carte disponible pour commencer le jeu.");
                gameFinished = true;
            }
        } catch (Exception e) {
            System.out.println("Une erreur est survenue pendant l'initialisation de la partie: " + e.getMessage());
            gameFinished = true;
        }
    }

    public void inverserSens() {
        inverserSens = !inverserSens;
    }

    public void tourJoueur() {
        try {
            Joueur joueur = joueurs.get(indexJoueurCourant);
            System.out.println("C'est au tour de " + joueur.getNomJoueur());
            System.out.println("Carte en jeu: " + piocheJetable.getCarteEnJeu());
            System.out.println("Votre main: " + joueur.getMain());
            System.out.println("Entrez le numéro de la carte que vous voulez jouer: ");
            int indexCarte = scanner.nextInt();
            if (indexCarte < 0 || indexCarte >= joueur.getMain().size()) {
                System.out.println("Index de carte invalide.");
                return;
            }
            Carte carte = joueur.getMain().get(indexCarte);
            joueur.jouerCarte(carte);
            if (joueur.getNombreCartes() == 1) {
                joueur.direUno();
            }
            if (joueur.getNombreCartes() == 0) {
                System.out.println(joueur.getNomJoueur() + " a gagné !");
                gameFinished = true;
                return;
            }
            finDeLaPartie();
            indexJoueurCourant = (indexJoueurCourant + 1) % joueurs.size();
        } catch (Exception e) {
            System.out.println("Une erreur est survenue pendant le tour du joueur: " + e.getMessage());
        }
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
            System.exit(0);
        } else {
            System.out.println("La partie continue.");
        }
    }

    public Deck getDeck() {
        return deck;
    }

    public int getNbJoueurs() {
        return nbJoueurs;
    }

    public boolean isGameFinished() {
        return gameFinished;
    }
}