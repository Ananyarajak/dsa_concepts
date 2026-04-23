//single level
// class Shape {
//     System.out.println("display area");
// }
// class Triangle extends Shape {
//    public void Area(int l,int h){
//     System.out.println(1/2*l*h);

//    }
// }
// public class inheritance {
//     public static void main(String[] args) {

//     }

// }

//multi level
// class Shape {
//     public void Area() {
//         System.out.println("display area");
//     }
// }

// class Triangle extends Shape {
//     public void Area(int l, int h) {
//         System.out.println(1 / 2 * l * h);
//     }
// }

// class EquilateralTriangle extends Triangle {
//     public void area(int l, int h) {
//         System.out.println(1 / 2 * 1 * h);
//     }
// }

// public class inheritance {
//     public static void main(String[] args) {
        
//     }

// }

//hierarichal
// class Shape {
//     public void Area() {
//         System.out.println("display area");
//     }
// }

// class Triangle extends Shape {
//     public void Area(int l, int h) {
//         System.out.println(1 / 2 * l * h);
//     }
// }

// class Circle extends Shape {
//     public void area(int r) {
//         System.out.println(3.14*r*r);
//     }
// }

// public class inheritance {
//     public static void main(String[] args) {
        
//     }

// }

//hybrid 
class Shape {
    public void Area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void Area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * 1 * h);
    }
}
public class inheritance {
    public static void main(String[] args) {
        
    }

}