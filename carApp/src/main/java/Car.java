public class Car {
    private static final int MAX_SPEED = 120;
    public static final int TEN = 10;
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
        if (MAX_SPEED >= this.speed + TEN) {
            this.speed += TEN;
            // afficher détails
            this.printDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    private void printDetails() {
        System.out.println("Modèle : " + this.model);
        System.out.println("Couleur : " + this.color);
        System.out.println("Vitesse actuelle : " + this.speed);
    }

    public void slowDown() {
        if (0 <= this.speed - TEN) {
            this.speed -= TEN;
            // afficher détails
            this.printDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

