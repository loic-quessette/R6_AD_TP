public class Driver {
    private static final int ADULT_AGE = 18;
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public Driver(String name, int years) {
        this.name = name;
        this.age = years;
    }

    public boolean isAdult() {
        return ADULT_AGE <= this.age;
    }
}
