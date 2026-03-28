// public class validParentheses {
//      static boolean isValid(String str){
//         int prevLength = -1;

//         while (prevLength != str.length()) {
//             prevLength = str.length();
//             str = str.replace("()", "");
//             str = str.replace("{}", "");
//             str = str.replace("[]", "");
//         }
//        return str.length() == 0;
//     }
//     public static void main(String[] args) {
//         String str ="{[()]}";
//         System.out.println(isValid(str)? "valid": "not valid");
//     }
// }

import java.util.Scanner;
import java.util.Stack;

public class validParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
       return stack.isEmpty(); 
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isValid(s) ? "Valid" : "Invalid");
        sc.close();
     }
}
