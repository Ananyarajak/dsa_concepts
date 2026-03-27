public class maxElement {
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 6, 5, 4, 3 };
        int result = findMax(arr);
        System.out.println("Maximum value is: " + result);
    }
}
