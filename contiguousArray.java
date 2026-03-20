import java.util.HashMap;

public class contiguousArray {
    public int findMaxLength(int[] nums) {
       HashMap <Integer,Integer> map = new HashMap<>();
       map.put(0,-1);
        int sum=0;
        int maxLength=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum+=-1;
            } else{
                 sum+=1; 
            }

            if(map.containsKey(sum)){
                int len = i-map.get(sum);
                if(len>maxLength){
                    maxLength=len;
                }
             }else{
                map.put(sum,i);
            }
        }
       return maxLength;
    }
    public static void main(String[] args) {
        int nums[]={1,0,0,0,1,1,1};

        contiguousArray obj = new contiguousArray();
        int result = obj.findMaxLength(nums);
        System.out.println(result);
    }
    
}
