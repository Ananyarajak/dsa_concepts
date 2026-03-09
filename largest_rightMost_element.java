public class largest_rightMost_element {
    public static void main(String[] args) {
        // int arr[] = { 16, 17, 4, 8, 5, 2 };
        // for (int i = 0; i <= 5; i++) {
        // for (int j = i; j <= 5 ; j++) {
        // if (arr[i] < arr[j]) {
        // System.out.println(arr[j]);
        // }
        // }
        // }

        int[] arr = { 16, 17, 4, 8, 5, 2 };
        int[] ans = new int[7];
        int j = 0;
        int curr_max = arr[arr.length - 1];
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] >= curr_max) {
                curr_max = arr[i];
                ans[j] = curr_max;
                j++;
            }
        }
        for (int k = 0; k < j; k++) {
            System.out.println(ans[k]);
        }
    }
}
