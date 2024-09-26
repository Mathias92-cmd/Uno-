package uno;

public abstract class Carte {
    private Couleur couleur;
    private Valeur valeur;
    private int nbCartes;
    private Carte carte;

    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
        nbCartes = 0;
    }

    public int getNbCartes() {
        return nbCartes;
    }

    public boolean estJouable() {
        if(carte.getCouleur() == couleur || carte.getValeur() == valeur) {
            return true;
        }
        return false;
    }

    public void setNbCartes(int nbCartes) {
        this.nbCartes = nbCartes;
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