class pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing......");
    }

    public void PrintColor(){
        System.out.println(this.color);
    }
}

public class this_keyword {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color = "Blue";
        p1.type = "Gel";

        p1.write();
        p1.PrintColor();

    }

}

