import java.util.*;
public class caluProduct {
    public static int calculateProduct(int a, int b) {  
        int mul=a*b;
        return mul;
    }

    public static void main(String[] args) {
        System.out.print("enter two numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul=calculateProduct(a,b);
        System.out.print("product of 2 numbers are :"+mul);
    }
} 
