package uno;

public abstract class Carte {
    private Couleur couleur;
    private Valeur valeur;
    private int nbCartes;

    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
        nbCartes = 0;
    }

    public int getNbCartes() {
        return nbCartes;
    }

    public boolean estJouable(Carte carte) {
        // Implémentation de la méthode
        return false;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public Valeur getValeur() {
        return valeur;
    }

    public String toString() {
        return couleur + " " + valeur;
    }
}