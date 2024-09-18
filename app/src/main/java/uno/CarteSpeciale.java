package uno;

public class CarteSpeciale extends Carte {

    public enum Effet {
        PlusDeux,
        PlusQuatre,
        InversionSens,
        ChangementCouleur
    }

    private Effet effet;

    public CarteSpeciale(String couleur , Effet effet) {
        super(couleur, "");
        this.effet = effet;
    }

    public void appliquerEffetPlusDeux(Carte carte) {
        int nbCarte = getNbCartes();
        if (carte instanceof CarteSpeciale) {
            Effet effet = ((CarteSpeciale) carte).getEffet();
            if (effet == Effet.PlusDeux) {
                System.out.println("Le joueur suivant pioche 2 cartes");
                nbCarte += 2;
            } else if (effet == Effet.PlusQuatre) {
                System.out.println("Le joueur suivant pioche 4 cartes");
                nbCarte += 4;
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
