public class twoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 9 };
        int target = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

}
