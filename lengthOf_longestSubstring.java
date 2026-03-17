import java.util.HashSet;

public class lengthOf_longestSubstring {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        String s="abcbadca";
        int j=0,max=0;
        
        for(int i=0;i<s.length();i++){
         while(set.contains(s.charAt(i))) {
            set.remove(s.charAt(j));
            j++;
         }
         set.add(s.charAt(i));
         if((i - j + 1) > max) {
           max = i - j + 1;
         }
        }
      System.out.println(max);
    }
}
