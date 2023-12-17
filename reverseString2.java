class reverseString2 {
    public static void main(String[] args) {
        String input = "Dheeraj Tanwar";
        String result = reverseString(input);
        result = result.trim();
        System.out.println(result);
        System.out.println(result.length());
    }

    public static String reverseString(String input) {
        String[] splitString = input.split(" ");
        String result = "";
        for (int i = splitString.length - 1; i >= 0; i--) {
            result += splitString[i] + " ";
        }
        return result;
    }
}
