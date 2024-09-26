package uno;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CarteSpeciale extends Carte {

    Scanner scanner = new Scanner(System.in);

    public enum Effet {
        PlusDeux,
        PlusQuatre,
        InversionSens,
        ChangementCouleur
    }

    private Effet effet;
    private List<Joueur> joueurs;

    public CarteSpeciale(Couleur couleur, Valeur valeur, Effet effet) {
        super(couleur, valeur);
        this.effet = effet;
    }

    public void appliquerEffet(UnoGame jeu) {
        Joueur joueurSuivant = jeu.getJoueurs().get((jeu.getIndexJoueurCourant() + 1) % jeu.getNbJoueurs());
        if (effet == Effet.PlusDeux) {
            System.out.println("Le joueur suivant pioche 2 cartes");
            for (int i = 0; i < 2; i++) {
                joueurSuivant.piocherCarte(jeu.getDeck().piocherCarte());
            }
        } else if (effet == Effet.PlusQuatre) {
            System.out.println("Le joueur suivant pioche 4 cartes");
            for (int i = 0; i < 4; i++) {
                joueurSuivant.piocherCarte(jeu.getDeck().piocherCarte());
            }
        } else if (effet == Effet.ChangementCouleur) {
            System.out.println("Veuillez choisir une couleur (rouge, bleu, vert, jaune)");
            Couleur nouvelleCouleur = Couleur.valueOf(scanner.next().toUpperCase());
            this.setCouleur(String.valueOf(nouvelleCouleur));
            System.out.println("Vous avez choisi la couleur " + nouvelleCouleur);
        } else if (effet == Effet.InversionSens) {
            System.out.println("Le sens de jeu est inversé");
            jeu.inverserSens();
        }
    }

    public Effet getEffet() {
        return effet;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    @Override
    public boolean estJouable(Carte carte) {
        return Objects.equals(this.getCouleur(), carte.getCouleur()) || Objects.equals(this.getValeur(), carte.getValeur()) || carte instanceof CarteSpeciale;
    }
}