package uno;

public class CarteSpeciale extends Carte {

    private String effet;

    public CarteSpeciale(String couleur, String effet) {
        super(couleur, "");
        this.effet = effet;
    }

    public void appliquerEffet() {

    }

    public boolean estJouable(Carte carte) {
        return false;
    }

}
