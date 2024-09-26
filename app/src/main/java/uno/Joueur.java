package uno;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private String nomJoueur;
    private List<Carte> main;

    public Joueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
        this.main = new ArrayList<>();
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public List<Carte> getMain() {
        return main;
    }

    public int getNombreCartes() {
        return main.size();
    }

    public void piocherCarte(Carte carte) {
        main.add(carte);
    }

    public void jouerCarte(Carte carte) {
        main.remove(carte);
    }

    public void direUno() {
        System.out.println(nomJoueur + " dit UNO !");
    }
}