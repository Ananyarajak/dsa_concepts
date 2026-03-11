public class leftRight_equal {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8};
        int l[] = new int[arr.length];
        int r[] = new int[arr.length];
        int ans =-1;
        for (int i = 1; i < arr.length; i++) {
           l[i]=l[i-1]+arr[i-1];
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            r[i]=r[i+1]+arr[i+1];
        }
        for (int i = 0; i < arr.length; i++) {
            if (l[i] == r[i]) {
                 ans=i;
                 break;

            }
        }
         System.out.println(ans);
    }
}
