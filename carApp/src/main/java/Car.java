public class Car {
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (speed + 10 <= 120) {
            speed += 10;
            // afficher détails
            System.out.println("Modèle : " + this.model);
            System.out.println("Couleur : " + this.color);
            System.out.println("Vitesse actuelle : " + this.speed);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void slowDown() {
        if (speed - 10 >= 0) {
            speed -= 10;
            // afficher détails
            System.out.println("Modèle : " + this.model);
            System.out.println("Couleur : " + this.color);
            System.out.println("Vitesse actuelle : " + this.speed);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

