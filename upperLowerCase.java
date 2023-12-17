public class upperLowerCase {
    public static void main(String[] args) {
        String input = "DhEeRaJ";
        System.out.println("Upper Case: " + upper(input));
        System.out.println("Lower Case: " + lower(input));
    }

    public static String upper(String input) {
        String result = "";
        for (char c : input.toCharArray()) {
            if (c >= 97 && c <= 122) {
                result += (char) ((int) c - (char) 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    public static String lower(String input) {
        String result = "";
        for (char c : input.toCharArray()) {
            if (c >= 65 && c <= 90) {
                result += (char) ((int) c + (char) 32);
            } else {
                result += c;
            }
        }
        return result;
    }
}
