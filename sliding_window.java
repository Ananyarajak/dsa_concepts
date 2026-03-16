public class sliding_window {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 4, 6, 5, 8 };
        int k = 4;
        int sum = 0;
        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        max_sum = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if (sum > max_sum) {
                max_sum = sum;
            }
        }
        System.out.println(max_sum);
    }
}

