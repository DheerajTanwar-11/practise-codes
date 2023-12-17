public class removeWhiteSpace {
    public static void main(String[] args) {
        String input = "Jump Over My Head";
        System.out.println("Original String: " + input);
        System.out.println("Result: " + removeSpace(input));
    }

    public static String removeSpace(String input) {
        String result = "";
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                result += c;
            }
        }
        return result;
    }
}
