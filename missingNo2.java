public class missingNo2 {
    public static void main(String[] args) {
        int nums[] = { 0, 2, 3, 4, 5 };
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(expectedSum - sum);
    }

}
