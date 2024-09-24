package uno;

public class CarteClassique extends Carte {


    public CarteClassique(Couleur couleur, Valeur valeur) {
        super(couleur, valeur);
    }

    public void appliquerEffet() {

    }

    public boolean estJouable(Carte carte) {
        return false;
    }
}
