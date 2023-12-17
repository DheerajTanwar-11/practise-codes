public class compareStrings {
    public static void main(String[] args) {
        String input1 = "Dheeraj";
        String input2 = "Dheeraj";
        System.out.println(compare(input1, input2));
    }

    public static boolean compare(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        }
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) != input2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
