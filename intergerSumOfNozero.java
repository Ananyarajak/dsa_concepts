import java.util.Arrays;

public class intergerSumOfNozero {
    public int[] getNoZeroIntegers(int n) {
        for(int a=1;a<n;a++){
            int b = n-a;        

          if(noZero(a) && noZero(b)){
            return new int[]{a ,b};
           }
        }    
     return new int[]{};
    }
    public boolean noZero(int num){
        while(num>0){
            if(num % 10 == 0){
            return false;
            }
            num /=10;
        }
    return true;
    } 
    public static void main(String[] args) {
        int n=2;
        intergerSumOfNozero obj = new intergerSumOfNozero();
        int [] result = obj.getNoZeroIntegers(n) ;
        System.out.println(Arrays.toString(result));
    }
}
