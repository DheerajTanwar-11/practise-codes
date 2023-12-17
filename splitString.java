import java.util.*;

class splitString {
    public static void main(String[] args) {
        String input = "Hi! My Name is Dheeraj Tanwar";
        ArrayList<String> output = splitStr(input);
        System.out.println(output);
    }

    public static ArrayList<String> splitStr(String input) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                result.add(str.toString());
                str.delete(0, str.length());
            } else {
                str.append(c);
            }
        }
        result.add(str.toString());
        return result;
    }
}