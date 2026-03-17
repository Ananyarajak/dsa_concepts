public class maxAverageSW {
    public static void main(String[] args) {
        int nums[] = { 1, 12, -5, -6, 30, 3 };
        int k = 4;
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        double ave = (double)maxSum / k;
        System.out.println(ave);

    }
}
