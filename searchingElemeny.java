import java.util.*;

public class searchingElemeny {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of aaray:-");
        int size = sc.nextInt();
        System.out.println("enter the element of aaray:-");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to find:-");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }
        sc.close();
    }
}
