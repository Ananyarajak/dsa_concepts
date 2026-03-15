//non-empty array of integers, every element appears twice except one.Find that single number.
public class singleElement {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 3, 6 ,3};
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    value = i;
                }
            }
        }
        System.out.println(value);
    }
}
