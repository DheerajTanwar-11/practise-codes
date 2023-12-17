public class reverseArray {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] result = reverse(input);
        for (int c : result) {
            System.out.print(c + " ");
        }
    }

    public static int[] reverse(int[] input) {
        int left = 0;
        int right = input.length - 1;
        while (left < right) {
            int temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }
        return input;
    }
}
