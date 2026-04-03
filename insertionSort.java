public class insertionSort {
     public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 2, 1, 3, 9 };

        // time complexity 0(n^2)
        for (int i = 0; i < arr.length; i++) { 
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j] ){
                arr[j+1]=arr[j];
                j--;
            }
          //placement
          arr[j+1] = current;
        }
        printArray(arr);
    }
}
