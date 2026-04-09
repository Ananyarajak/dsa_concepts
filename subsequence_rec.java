// public class subsequence_rec {
//     public static void subsequences(String str, int idx, String newString) {
//         if (idx == str.length()) {
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         // to- be
//         subsequences(str, idx + 1, newString + currChar);
//         // or not to be subsequences (str, idx+1, newString);
//         subsequences(str, idx + 1, newString);
//     }

//     public static void main(String args[]) {
//         String str = "abc";
//         subsequences(str, 0, "");
//     }

// }


//Print all the unique subsequences of a string
import java.util.HashSet;

public class subsequence_rec {
    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(idx);
        // to- be
        subsequences(str, idx + 1, newString + currChar, set);
        // or not to be subsequences (str, idx+1, newString);
        subsequences(str, idx + 1, newString, set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }

}