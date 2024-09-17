package uno;

public class CarteClassique extends Carte {
    private String couleur;
    private String valeur;

    public CarteClassique(String couleur, String valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    public void appliquerEffet() {

    }

    public boolean estJouable(Carte carte) {
        return false;
    }
}
