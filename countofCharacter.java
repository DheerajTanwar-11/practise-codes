import java.util.HashMap;
import java.util.Map.Entry;

class countofCharacter {
    public static void main(String[] args) {
        String input = "aaeeeccbbmmn";
        HashMap<Character, Integer> result = getCount(input);
        for (Entry<Character, Integer> e : result.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    public static HashMap<Character, Integer> getCount(String input) {
        HashMap<Character, Integer> result = new HashMap<>();
        for (char c : input.toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }
        return result;
    }
}
