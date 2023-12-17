import java.util.regex.Pattern;

public class emailValidator {
    public static void main(String[] args) {
        String email = "example.samplemail@gmail.com";
        System.out.println(emailValidators(email));
    }

    public static boolean emailValidators(String email) {
        String emailPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        return Pattern.matches(emailPattern, email);
    }
}
