class palindromeCheck {
    public static void main(String[] args) {
        String input = "radar";
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
