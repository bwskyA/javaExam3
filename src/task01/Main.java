package task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(dayOfBirth(dateOfBirth()));
    }

    public static LocalDate dateOfBirth() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your date of birth:");
        LocalDate dateOfBirth = LocalDate.parse(scanner.next());
        if (dateOfBirth.isAfter(LocalDate.now())) {
            throw new InvalidBirthDateException("You entered a date later than today's date!!");
        }

        return dateOfBirth;
    }

    public static String dayOfBirth(LocalDate birthDate) {
        DayOfWeek dayOfBirth = birthDate.getDayOfWeek();
        Locale polish = new Locale("pl", "PL");

        return "The day you were born in Polish is " + dayOfBirth.getDisplayName(TextStyle.FULL_STANDALONE, polish);
    }
}
