public class Voiture {
    private String modele;
    private String couleur;
    private int vitesse;

    public Voiture(String model, String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        if (vitesse + 10 <= 120) {
            vitesse += 10;
            // afficher détails
            System.out.println("Modèle : " + this.modele);
            System.out.println("Couleur : " + this.couleur);
            System.out.println("Vitesse actuelle : " + this.vitesse);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (vitesse - 10 >= 0) {
            vitesse -= 10;
            // afficher détails
            System.out.println("Modèle : " + this.modele);
            System.out.println("Couleur : " + this.couleur);
            System.out.println("Vitesse actuelle : " + this.vitesse);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

