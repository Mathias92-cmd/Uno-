package uno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Joueur {
    private String nomJoueur;
    private List<Carte> main;

    Scanner scanner = new Scanner(System.in);

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

    public List<Carte> getMain() {
        return main;
    }


    public void direUno() {
        if(getNombreCartes() == 1 ){
            System.out.println("Voullez vous dire Uno ?");
            int choix = scanner.nextInt();
            if(choix == 1){
                System.out.println("Uno !");
            } else {
                System.out.println("Vous avez oublié de dire Uno !");
                piocherCarte();
                piocherCarte();
            }
        }
    }

    public boolean gagnant() {
        return false;
    }
}
