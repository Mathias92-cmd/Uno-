package uno;

public class CarteSpeciale extends Carte {


    public CarteSpeciale(String couleur, String valeur) {
        super(couleur, valeur);
    }

    public void appliquerEffet() {

    }

    public boolean estJouable(Carte carte) {
        return false;
    }

}
