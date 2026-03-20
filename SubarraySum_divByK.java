// public class SubarraySum_divByK {
    
//     public static void main(String[] args){
//         int nums[] = {4,5,0,-2,-3,1};
//         int k=5;
//         int count =0;
//         for(int i=0;i<nums.length;i++){
//             int sum = 0;

//             for(int j=i;j<nums.length;j++){
//               sum+=nums[j];
//                if(sum % k ==0){
//                 count++;
//                }
//             }
//         }
//        System.out.println(count); 
//     }
// }

//optimal solution

import java.util.HashMap;

public class SubarraySum_divByK { 
   public static void main(String[] args){
         int nums[] = {4,5,0,-2,-3,1};
         int k=5;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count =0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int currSum = sum % k;

               if(currSum<0){
                currSum+=k;
               }

               if(map.containsKey(currSum)){
                count+=map.get(currSum);
               }
               map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
       System.out.println(count);
    }
}