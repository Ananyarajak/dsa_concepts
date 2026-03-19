public class continousArraySum {
     public boolean checkSubarraySum(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
             int sum=0;

            for(int j=i;j<nums.length;j++){
            sum+=nums[j];

            if(j-i+1 >= 2){
                if(k==0){
                    if(sum==0)return true;
                }else{
                    if(sum % k ==0) return true;
                    }
                } 
           }
        }
        return false; 
    }
    public static void main(String[] args) {
        int nums [] ={2,4,6,7};
        int k = 6;

        continousArraySum obj = new continousArraySum();
        boolean result = obj.checkSubarraySum(nums, k);
        System.out.println(result);
    }
    
}
