public class subArraySum {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int target = 7;
        subSum(arr, target);
    }

    public static void subSum(int[] arr, int target) {
        int sum = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == target) {
                    start = i;
                    end = j;
                }
            }
        }
        if (start == 0 && end == 0) {
            System.out.println("There is no such subaraay with given target sum");
        } else {
            System.out.println("SubArray with target sum: ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
