public class prefix_sum {
public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int start =4;
        int curr_sum=0;
        for(int i=0;i<start;i++){
            curr_sum += arr[i];
            System.out.println(curr_sum);
        }
    }
}
 

// public class prefix_sum {
//     public static void main(String[] args) {
//         int arr[] ={1,2,3,4,5,6};
//         int arr2[]= new int [arr.length];
//         int curr_sum=0;
//         for(int i=0;i<arr.length;i++){
//             curr_sum += arr[i];
//             arr2[i]=curr_sum;
//             System.out.println(arr2[i]);
//         }
//     }
    
// }
