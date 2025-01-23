public class Driver {
    private String name;
    private int age;

    public Driver(String name, int years) {
        this.name = name;
        this.age = years;
    }

    public boolean isAdult() {
        return 18 <= this.age;
    }

    public void startCar(Car voiture) {
        if (this.isAdult()) {
            System.out.println(this.name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Car voiture) {
        System.out.println(this.name + " arrête la voiture.");
    }

    public void changeSpeed(Car car, int newSpeed) {
        System.out.println(this.name + " change la vitesse de la car à " + newSpeed);
        int vitesseActuelle;
        if (car.getSpeed() >= newSpeed) {
            while (car.getSpeed() > newSpeed) {
                car.slowDown();
            }
        } else  {
            while (car.getSpeed() < newSpeed) {
                car.accelerate();
            }
        }
    }
}
