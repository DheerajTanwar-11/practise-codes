import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String input = "Dheeraj";
        String target1 = "eerDhaj";
        String target2 = "eerDhat";
        System.out.println("isAnagram of target1: " + checkAnagram(input, target1));
        System.out.println("isAnagram of target2: " + checkAnagram(input, target2));
    }

    public static boolean checkAnagram(String input, String target) {
        HashMap<Character, Integer> inpMap = new HashMap<>();
        HashMap<Character, Integer> trgMap = new HashMap<>();
        if (input.length() != target.length()) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            inpMap.put(input.charAt(i), inpMap.getOrDefault(input.charAt(i), 0) + 1);
            trgMap.put(target.charAt(i), trgMap.getOrDefault(target.charAt(i), 0) + 1);
        }
        return inpMap.equals(trgMap);
    }
}
