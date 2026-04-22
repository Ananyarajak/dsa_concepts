class pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing......");
    }
}

public class class_object {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color = "Blue";
        p1.type = "Gel";

        p1.write();

    }

}
