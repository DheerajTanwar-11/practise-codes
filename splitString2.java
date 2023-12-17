import java.util.*;

public class splitString2 {
    public static void main(String[] args) {
        String input = "Hi! My Name Is Dheeraj Tanwar";
        System.out.println(splitString(input));
    }

    public static ArrayList<String> splitString(String input) {
        ArrayList<String> result = new ArrayList<>();
        int wordStrt = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                result.add(input.substring(wordStrt, i));
                wordStrt = i + 1;
            }
        }
        result.add(input.substring(wordStrt));
        return result;
    }
}
