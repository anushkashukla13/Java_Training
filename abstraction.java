abstract class animal{
    abstract void sound();
}

// class dog extends animal{
//      void sound(){
//         System.out.println("woof woof");
//     }
// }

// class cat extends animal{
//     void sound(){
//         System.out.println("meowwwwwwwwwwww");
//     }
// }
// abstract class Shape{
//     abstract void area();
// }
// class Circle extends Shape{
//     void area(){
//         System.out.println("3.14 *r^2");
//     }
// }

// class Rectangle extends Shape{
//     void area(){
//         System.out.println("length*breadth");
//     }
// }

abstract class payment{
    abstract void pay(int a);
    void success(){
        System.out.println("payment successful");
    }   

}

class Upi extends payment{
    void pay(int a){
        System.out.println("paying "+a+" through UPI");
    }
}

class netbanking extends payment{
    void pay(int b){
        System.out.println("paying "+b+" through netbanking");
    }
}


public class abstraction {
    public static void main(String[] args) {
        // animal a1= new cat();
        // animal a2= new dog();
        // a2.sound();
        // a1.sound();
        //   Shape s1= new Circle();
        //   Shape s2= new Rectangle();
        //   s1.area();
        //   s2.area();

        payment p1= new Upi();
        payment p2= new netbanking();

        p1.pay(100);
        p1.success();

        p2.pay(200);
        p2.success();

    }
}
