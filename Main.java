interface A {
    void methodA();
}
class B implements A {
    public void methodA() {
        System.out.println("Method A implemented in class B");
    }
}


public class Main {
    public static void main(String[] args) {
        // B b = new B();
        // b.methodA();
        A a = new B();
        a.methodA();
    }
}

// multiple inheritance is not possible in java but we can achieve it through interfaces
//solve