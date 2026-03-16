public class subarray_count {
    // no. of subarray having more than equal to x.
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 4, 12, 1, 2 };
        int k = 20;
        int count = 0;
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum >= k) {
                    count++;
                }
            }
        }
        System.out.println("count " + count);
    }
}
