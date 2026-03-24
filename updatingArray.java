public class updatingArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        arr[2] = 100;

        arr[0] = 5;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    
