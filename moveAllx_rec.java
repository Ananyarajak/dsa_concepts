public class moveAllx_rec {
    public static void move(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            move(str, idx + 1, count, newString);
        } else {
            newString += currChar; // newString = newString + currChar
            move(str, idx + 1, count, newString);
        }
    }
    public static void main(String args[]) {
        String str = "axbxcdx";
        move(str, 0,0, "");
    }
}
