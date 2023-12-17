public class replaceSubstring {
    public static void main(String[] args) {
        String input = "The quick brown fox jumped over the lazy dog.";
        String target = "the";
        String replacement = "a";

        String replacedString = replaceAll(input, target, replacement);
        System.out.println("Original String: " + input);
        System.out.println("Replaced String: " + replacedString);
    }

    public static String replaceAll(String input, String target, String replacement) {
        if (input == null || target == null) {
            throw new IllegalArgumentException("Input Strings cannot be null...");
        }
        StringBuilder str = new StringBuilder();
        int index = 0;
        while (index < input.length()) {
            int targetIndex = input.indexOf(target, index);
            if (targetIndex > index) {
                str.append(input.substring(index, targetIndex));
            }
            str.append(replacement);
            index = targetIndex + target.length();
        }
        if (index < input.length()) {
            str.append(input.substring(index));
        }
        return str.toString();
    }
}
