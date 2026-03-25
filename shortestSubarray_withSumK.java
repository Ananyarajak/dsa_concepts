public class shortestSubarray_withSumK {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        int minLen = n + 1;  
        for(int i = 0; i < n; i++) {
            int sum = 0;

            for(int j = i; j < n; j++) {
                sum += nums[j];

                if(sum >= k) {
                    int len = j - i + 1;

                    if(len < minLen) {
                        minLen = len;
                    }

                    break; 
                }
            }
        }

        // if not updated
        if(minLen == n + 1) {
            return -1;
        }

        return minLen;
    }

    public static void main(String[] args) {
        int[] nums = {2, -1, 2};
        int k = 3;

         shortestSubarray_withSumK obj = new shortestSubarray_withSumK();
        int result = obj.shortestSubarray(nums, k);

        System.out.println("Shortest length: " + result);
    }
}
    

