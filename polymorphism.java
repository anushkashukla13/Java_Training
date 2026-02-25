
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
public class polymorphism {
//     void add(){
//         System.out.println("hello");
//     }

//     void add(int a){
//         System.out.println(a);
//     }

//     void add(int a, int b){
//         System.out.println(a+b);
//     }
    public static void main(String[] args) {
        // polymorphism p1 = new polymorphism(); //method overloading

        // p1.add();
        // p1.add(5);
        // p1.add(5, 10);

        Animal a1 = new Animal();
        a1.sound();

        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.sound();

        
    }
}
