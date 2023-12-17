import java.util.*;

public class countUniqueChar {
    public static void main(String[] args) {
        String input = "aaaaaaaeeeeeewwwwwtttttggbbbbssjjjtttbbbbafje";
        System.out.println("Number of unique characters: " + countChar(input));
    }

    public static int countChar(String input) {
        HashSet<Character> chars = new HashSet<>();
        for (char c : input.toCharArray()) {
            chars.add(c);
        }
        return chars.size();
    }
}
