public class rangeSum {
    int sum[];

    public rangeSum(int[] nums) {
        sum = new int[nums.length];
        sum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return sum[right];
        }
        return sum[right] -sum[left - 1];

    }

    public static void main(String[] args) {
        int nums[] = {2,-4,6,7,-3,5};

        rangeSum obj = new rangeSum(nums);
        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));

    }
}
