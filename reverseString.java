class reverseString {
    public static void main(String[] args) {
        String input = "dheeraj tanwar";
        System.out.println(reverseStr(input));
    }

    public static String reverseStr(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }
}