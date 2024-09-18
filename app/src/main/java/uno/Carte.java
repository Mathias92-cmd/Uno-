package uno;

public abstract class Carte {
    private String couleur;
    private String valeur;
    private int nbCartes;

    public Carte(String couleur, String valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
        nbCartes = 0;
    }

    public int getNbCartes() {
        return nbCartes;
    }

    public boolean estJouable(Carte carte) {

    }

    public String getCouleur() {
        return couleur;
    }

    public String getValeur() {
        return valeur;
    }

    public String toString() {
        return couleur + " " + valeur;
    }


}
