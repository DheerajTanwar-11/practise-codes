import java.util.*;

public class countOfUniqueVowel {
    public static void main(String[] args) {
        String input = "Dheeraj Tanwar is Engineer";
        System.out.println("Count of unique vowel: " + countVowel(input));

    }

    public static int countVowel(String input) {
        HashSet<Character> vowelSet = new HashSet<>();
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        input = input.toLowerCase();
        for (char c : input.toCharArray()) {
            for (char v : vowels) {
                if (c == v) {
                    vowelSet.add(c);
                }
            }
        }
        return vowelSet.size();
    }
}
