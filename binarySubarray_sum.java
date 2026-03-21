// public class binarySubarray_sum {
//     public static void main(String[] args) {
//         int nums[] = {1,0,1,0,1};
//         int goal=2;
//         int count=0;

//         for(int i=0;i<nums.length;i++){
//              int sum=0;

//             for(int j=i;j<nums.length;j++){
//                  sum+=nums[j];

//                 if(sum==goal){
//                     count++;
//                 }
//             } 
//         }
//         System.out.println(count);
//     }
// }

//optimal solution

import java.util.HashMap;

public class binarySubarray_sum {
    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - goal)) {
                count += map.get(sum - goal);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 1, 1, 0, 1, 0 };
        int goal = 4;

        binarySubarray_sum obj = new binarySubarray_sum();
        int result = obj.numSubarraysWithSum(nums, goal);
        System.out.println(result);

    }
}
