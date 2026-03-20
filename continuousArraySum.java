//brute force

// public class continuousArraySum {
//      public boolean checkSubarraySum(int[] nums, int k) {
//         for(int i=0;i<nums.length;i++){
//              int sum=0;

//             for(int j=i;j<nums.length;j++){
//             sum+=nums[j];

//             if(j-i+1 >= 2){
//                 if(k==0){
//                     if(sum==0)return true;
//                 }else{
//                     if(sum % k ==0) return true;
//                     }
//                 } 
//            }
//         }
//         return false; 
//     }
//     public static void main(String[] args) {
//         int nums [] ={2,4,6,7};
//         int k = 6;

//         continuousArraySum obj = new continuousArraySum();
//         boolean result = obj.checkSubarraySum(nums, k);
//         System.out.println(result);
//     }

// }


//optimal solution
import java.util.HashMap;

public class continuousArraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int prefixSum = sum % k;

            if (map.containsKey(prefixSum)) {
                if (i - map.get(prefixSum) > 1) {
                    return true;
                } else {
                    map.put(prefixSum, i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 7 };
        int k = 6;

        continuousArraySum obj = new continuousArraySum();
        boolean result = obj.checkSubarraySum(nums, k);
        System.out.println(result);
    }
}