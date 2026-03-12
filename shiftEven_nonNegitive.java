public class shiftEven_nonNegitive {
    public static void main(String[] args) {
        int arr[]={4,6,0,1,-2,-3};
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 && arr[i]%2==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
                i--;
            }
        }
        for(int i:arr){
          System.out.println(i+" ");  
        }
    }
}