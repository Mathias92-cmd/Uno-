package uno;

public class Carte {
    private String couleur;
    private String valeur;

    public Carte(String couleur, String valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getValeur() {
        return valeur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return valeur + " de " + couleur;
    }
}