public class remove_duplicate {
    public static void main(String[] args) {
        int arr[] = { 6, 4, 6, 8, 6 ,8,7 };
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
