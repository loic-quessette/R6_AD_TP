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
        if (120 >= this.speed + 10) {
            this.speed += 10;
            // afficher détails
            this.extracted();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    private void extracted() {
        System.out.println("Modèle : " + this.model);
        System.out.println("Couleur : " + this.color);
        System.out.println("Vitesse actuelle : " + this.speed);
    }

    public void slowDown() {
        if (0 <= this.speed - 10) {
            this.speed -= 10;
            // afficher détails
            this.extracted();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

