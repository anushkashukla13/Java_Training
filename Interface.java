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
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
        d.show();
    }
}