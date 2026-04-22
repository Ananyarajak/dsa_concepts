// class Student {
//     String name;
//     int age;

// public void printInfo() {
// System.out.println (this.name);
// System.out.println(this.age);
// }

//     Student() {
//         System.out.println("constructor called");
//     }
// }

// public class constructor {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         s1.name = "shradha";
//         s1.age = 22;
//         s1.printInfo();
//     }
// }



//parameterized constructor
// class Student {
//     String name;
//     int age;

// public void printInfo() {
// System.out.println (this.name);
// System.out.println(this.age);
// }

//     Student(String name,int age) {
//        this.name = name;
//        this.age = age;
//     }
// }

// public class constructor {
//     public static void main(String args[]) {
//         Student s1 = new Student("ananya", 20);
//         s1.printInfo();
        
//     }
// }


//copy constructor

class Student {
    String name;
    int age;

public void printInfo() {
System.out.println (this.name);
System.out.println(this.age);
}

    Student(Student s2) {
       this.name = s2.name;
       this.age = s2.age;
    }

    Student(){

    }
}

public class constructor {
    public static void main(String args[]) {
        Student s1 = new Student(); 
        s1.name = "Ananya";
        s1.age = 20;

        Student s2 = new Student(s1); 
        
        s1.printInfo();
        
    }
}

