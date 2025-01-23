import java.time.LocalDate;

public class SimpleClass {

    public SimpleClass() {
    }

    /**
     * Additionne a et b
     * @param a - premier paramètre
     * @param b - second paramètre
     * @return
     */
    public int someAdditionMethod(int a, int b) {
        return a + b ;
    }

    public static boolean isDateOutSide(LocalDate date, LocalDate startingDate, LocalDate endingDate) {
        return !DateUtils.isDateBetween(date, startingDate, endingDate, true);
    }
    public static void main(String[] args) {
        new SimpleClass().someAdditionMethod(1,2);

        System.out.println("Hello world");
    }
}


