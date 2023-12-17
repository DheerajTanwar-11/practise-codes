import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class stringFormatting {
    public static void main(String[] args) {
        String isoDate = "2023-12-14";
        String formattedDate1 = dateFormat(isoDate, "DD/MM/YYYY");
        String formattedDate2 = dateFormat(isoDate, "MMMM, d, yyyy");
        System.out.println(formattedDate1);
        System.out.println(formattedDate2);
        try {
            dateFormat("foo-bar-baz", "DD/MM/YYYY");

        } catch (DateTimeParseException e) {
            System.out.println("Invalid Date Format");
        }

        double value = 1234.56;
        String currencyFormatted1 = currencyFormat(value, "en-US");
        String currencyFormatted2 = currencyFormat(value, "fr-CA");
        System.out.println(currencyFormatted1);
        System.out.println(currencyFormatted2);
    }

    public static String dateFormat(String input, String desiredFormat) {
        LocalDate date = LocalDate.parse(input);
        DateTimeFormatter result = DateTimeFormatter.ofPattern(desiredFormat);
        return date.format(result);
    }

    public static String currencyFormat(double amount, String locale) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.forLanguageTag(locale));
        return formatter.format(amount);
    }
}
