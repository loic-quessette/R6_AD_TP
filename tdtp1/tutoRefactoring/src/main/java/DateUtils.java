import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate now = LocalDate.now();
        return now.isAfter(startingDate)
                &&
                now.isBefore(endingDate);
    }

    public static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate now, boolean inclusive) {
        return now.isAfter(startingDate)
                &&
                now.isBefore(endingDate);
    }
}