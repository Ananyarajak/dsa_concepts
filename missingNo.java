import java.util.HashSet;

public class missingNo {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={0,1,2,3,6,7};
         missingNo obj = new missingNo();
         int result = obj.missingNumber(nums);
         System.out.println(result);

    }
    
}
