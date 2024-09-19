package uno;

public abstract class Carte {
    private int nbCartes;

    public enum Couleur {
        Rouge,
        Jaune,
        Verte,
        Bleue
    }

    public enum Valeur {
        Zero,
        Un,
        Deux,
        Trois,
        Quatre,
        Cinq,
        Six,
        Sept,
        Huit,
        Neuf
    }

    public Carte() {
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
