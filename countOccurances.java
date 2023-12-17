class countOccurances {
    public static void main(String[] args) {
        String input = "eeeeeeeeerrrrrrrrrrrttttttttvvvvvvveeeeee";
        char charInp = 'e';
        countChar(input, charInp);
    }

    public static void countChar(String input, char charInp) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == charInp) {
                count++;
            }
        }
        System.out.println("Occurrences of " + charInp + " : " + count);
    }
}
