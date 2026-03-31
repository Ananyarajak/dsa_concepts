public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ananya");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 't');
        System.out.println(sb);

        sb.insert(6,'a');
        System.out.println(sb);

        sb.delete(6, 7);
        System.out.println(sb);

        sb.append ("e");
        System.out.println(sb);


    }

}
