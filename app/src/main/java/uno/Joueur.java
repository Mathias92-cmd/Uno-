package uno;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private String nomJoueur;
    private List<Carte> main;

    public Joueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
        this.main = new ArrayList<Carte>();
    }

    public void jouerCarte(Carte carte) {

    }

    public Carte piocherCarte() {

    }

    public int getNombreCartes() {
        return main.size();
    }

    public void retirerCarte(Carte carte) {
        main.remove(carte);
    }


    public void direUno() {

    }

    public boolean gagnant() {
        return false;
    }
}
