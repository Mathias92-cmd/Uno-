package uno;

public class CarteClassique extends Carte {


    public CarteClassique(String couleur, String valeur) {
        super(couleur, valeur);
    }

    public void appliquerEffet() {

    }

    public boolean estJouable(Carte carte) {
        return false;
    }
}
