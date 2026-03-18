public class pivotIndex {
    public static void main(String[] args) {
        int nums[] = { 1,7,3,6,5,6 };
        int sum = 0;
        int Lsum = 0;
        int Rsum = 0;
        int ans = -1;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            Rsum = sum - Lsum - nums[i];
            if (Lsum == Rsum) {
                ans = i;
            }
            Lsum += nums[i];
        }
        System.out.println(ans);
    }
}
