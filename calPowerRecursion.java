// public class calPowerRecursion {    //stack height n
//     public static int calcPower(int x, int n) {
//         if (n == 0) {// base case 1
//             return 1;
//         }
//         if (x == 0) {// base case 2
//             return 0;
//         }

//         int xPownm1 = calcPower(x, n - 1); // kaam
//         int xPown = x * xPownm1;
//         return xPown;
//     }

//     public static void main(String args[]) {
//         int x = 3, n = 4;
//         int ans = calcPower(x, n);
//         System.out.println(ans);
//     }
// }

public class calPowerRecursion {    //stack height logn
    public static int calcPower(int x, int n) {
        if (n == 0) {// base case 1
            return 1;
        }
        if (x == 0) {// base case 2
            return 0;
        }

        if(n%2==0){
            return calcPower (x, n/2) * calcPower(x, n/2);
        }
        else{
            return calcPower (x, n/2) * calcPower (x, n/2) * x;
        }
    }

    public static void main(String args[]) {
        int x = 3, n = 4;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
