public class maximumSumSubArray {
    public static void main(String[] args) {
        int[] input = { 1, 5, 2, 7, 8, 5, 4, 3, 7, 5 };
        maxSum(input);
    }

    public static void maxSum(int[] input) {
        int maxsum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += input[k];
                }
                if (sum > maxsum) {
                    maxsum = sum;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.print("SubArray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
        System.out.println("Max Sum: " + maxsum);
    }
}
