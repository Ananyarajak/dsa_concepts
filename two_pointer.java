// public class two_pointer {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 7, 10 };
//         int l = 0, r = arr.length - 1;
//         int target = 15;
//         while (l < r) {
//             if ((arr[l] + arr[r]) == target) {
//                 System.out.println("pair exist" + " :" + l + " " + r);
//                 return;
//             } else if ((arr[l] + arr[r]) > target) {
//                 r--;
//             } else {
//                 l++;
//             }
//         }
//         System.out.println("pair not exist");
//     }

// }


public class two_pointer {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7, 8,10 };
        int l = 0, r = arr.length - 1;
        int target = 15;
        int count =0;
        while (l < r) {
            if ((arr[l] + arr[r]) == target) {
                System.out.println("pair exist" + " :" + l + " " + r);
                count++;
                l++;
            } else if ((arr[l] + arr[r]) > target) {
                r--;
            } else {
                l++;
            }
        }
        System.out.println(count);
    }

}

