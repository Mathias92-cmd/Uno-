package uno;

import java.util.Scanner;

public class CarteSpeciale extends Carte {

    Scanner scanner = new Scanner(System.in);

    private Couleur couleur;

    public enum Effet {
        PlusDeux,
        PlusQuatre,
        InversionSens,
        ChangementCouleur
    }

    private Effet effet;

    public CarteSpeciale(Couleur couleur,Valeur valeur ,  Effet effet) {
        super(couleur, valeur);
        this.effet = effet;
    }

    public void appliquerEffet(Carte carte) {
        int nbCarte = getNbCartes();
        if (carte instanceof CarteSpeciale) {
            Effet effet = ((CarteSpeciale) carte).getEffet();
            if (effet == Effet.PlusDeux) {
                System.out.println("Le joueur suivant pioche 2 cartes");
                nbCarte += 2;
            } else if (effet == Effet.PlusQuatre) {
                System.out.println("Le joueur suivant pioche 4 cartes");
                nbCarte += 4;
            } else if (effet == Effet.ChangementCouleur) {
                System.out.println("Veuillez choisir une couleur (rouge, bleu, vert, jaune)");
                Couleur couleur = Couleur.valueOf(scanner.next().toUpperCase());
                this.couleur = couleur;
                System.out.println("Vous avez choisi la couleur " + couleur);
            } else {
                System.out.println("Le sens de jeu est inversé");
                Joueur.inverserSens();
            }
        }
    }

    private Effet getEffet() {
        return effet;
    }


    public boolean estJouable(Carte carte) {
        return false;
    }

}
