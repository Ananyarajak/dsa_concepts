class Main {
    public static void main(String[] args) {
        int[] arr = {2,5,6,9,3,7};
        int max = 0;
        int secondmax = -1;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > secondmax && arr[i] != max){
                secondmax = arr[i];
            }
        }
        System.out.println(secondmax);
        System.out.println(max);
    }
}
