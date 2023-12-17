import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phoneExtractor {
    public static void main(String[] args) {
        String phonePattern = "^+91-\\d{10}";
        String text = "My phone number is +91-8890599802";
        Pattern pattern = Pattern.compile(phonePattern);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Found Phone Number: " + matcher.group());
        }
    }
}
