package uno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Joueur {
    private String nomJoueur;
    private List<Carte> main;
    private static boolean inverser = false;

    Scanner scanner = new Scanner(System.in);

    public Joueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
        this.main = new ArrayList<Carte>();
    }

    public static void inverserSens() {
        inverser = !inverser;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void jouerCarte(Carte carte) {
        if(carte.estJouable(Pioche.getCarteEnJeu())){
            retirerCarte(carte);
            Pioche.ajouterCarte(carte);
        } else {
            System.out.println("Vous ne pouvez pas jouer cette carte !");
            piocherCarte();
        }
    }

    public Carte piocherCarte() {
        if(main.size() == 0){
            System.out.println("Vous n'avez plus de carte, vous en piochez une !");
            piocherCarte();
        } else {

        }
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
