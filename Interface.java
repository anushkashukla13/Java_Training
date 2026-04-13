// Create an interface Shape with a method area().

    
// interface Shape {
//     void area();  // abstract method
// }

// // Circle class implementing Shape
// class Circle implements Shape {
//     double radius;

//     Circle(double radius) {
//         this.radius = radius;
//     }

//     public void area() {
//         double result = Math.PI * radius * radius;
//         System.out.println("Area of Circle: " + result);
//     }
// }

// // Rectangle class implementing Shape
// class Rectangle implements Shape {
//     double length, width;

//     Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     public void area() {
//         double result = length * width;
//         System.out.println("Area of Rectangle: " + result);
//     }
// }

// // Main class
// public class Interface {
//     public static void main(String[] args) {
//         Shape s1 = new Circle(5);
//         Shape s2 = new Rectangle(4, 6);

//         s1.area();
//         s2.area();
//     }
// }

// Create two interfaces:
// interface Printable {
//     void print();
// }

// interface Showable {
//     void show();
// }

// class Demo implements Printable, Showable {
//     public void print() {
//         System.out.println("Printing...");
//     }

//     public void show() {
//         System.out.println("Showing...");
//     }
// }

// public class Interface {
//     public static void main(String[] args) {
//         Demo d = new Demo();
//         d.print();
//         d.show();
//     }
// }

// Create an interface Test with a variable x = 10. Try changing it inside a class.
// interface Test {
//     int x = 10; // by default: public static final
// }

// class Demo implements Test {
//     public void show() {
//         // x = 20;  ERROR (cannot change final variable)
//         System.out.println("Value of x: " + x);
//     }
// }

// public class Interface {
//     public static void main(String[] args) {
//         Demo d = new Demo();
//         d.show();

//     }
// }
interface A {
    void show();
}

abstract class B implements A {
    // no implementation
}

class C extends B {
    public void show() {
        System.out.println("Hello");
    }
}

public class Interface {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}