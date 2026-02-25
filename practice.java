// class student{
//     String name;
//     int rollno;
//     int marks;

//     public student(String n,int r,int m){
//         name=n;
//         rollno=r;
//         marks=m;

//     }

//     void details(){
//         System.out.println(name+" "+ rollno+" "+ marks);
//     }

// }

// class rectangle {
//     float length, breadth;

//     void area(float length, float breadth) {
//         System.out.println(length * breadth);
//     }

//     void parameter(float length, float breadth) {
//         System.out.println(2 * (length + breadth));
//     }
// }

// class laptop{
//     String name;
//     int ram;
//     int price;
//     public laptop(String n,int r,int p){
//         name=n;
//         ram=r;
//         price=p;
//     }

//     void display(){
//         System.out.println(name+" "+ram+" "+price);
//     }
// }

// class claculator{
//     int a;
//     int b;

//     public claculator(int a,int b){
//         this.a=a;
//         this.b=b;
//     }

//     void sum(){
//         System.out.println(a+b);
//     }

//     void sub(){
//         System.out.println(a-b);
//     }

//     void mul(){
//         System.out.println(a*b);
//     }

//     void div(){
//         if(b!=0){
//             System.out.println(a/b);
//         }else{
//             System.out.println("division by zero is not allowed");
//         }

//     }
// }

// class movie{
//     String name;
//     int rating;
//     int releaseYear;

//     public movie(String n, int r, int y) {
//         name = n;
//         rating = r;
//         releaseYear = y;
//     }

//     void display() {
//         System.out.println(name + " has a rating of " + rating + " and was released in " + releaseYear);
//     }
// }

// class bankaccount{
//     String accountholder;
//     int accno;
//     double balance;

//     public bankaccount(String n,int a,double b){
//         accountholder=n;
//         accno=a;
//         balance=b;
//     }

//     void deposit(double amount){
//         balance+=amount;
//         System.out.println("Amount deposited: "+amount);
//         System.out.println("New balance: "+balance);
//     }
//     void withdraw(double amount){
//         if(amount<=balance){
//             balance-=amount;
//             System.out.println("Amount withdrawn: "+amount);
//             System.out.println("New balance: "+balance);
//         }else{
//             System.out.println("Insufficient balance");
//         }
//     }
// }

// class car{
//     String brand;
//     String model;
//     int price;

//     void details(String b,String m,int p){
//         brand=b;
//         model=m;
//         price=p;
//         System.out.println(brand+" "+model+" "+price);
//     }
// }

// class circle{
//     float radius;

//     void area(float radius){
//         this.radius=radius;
//         System.out.println(3.14*radius*radius);
//     }

//     void circumference(float radius){
//         this.radius=radius;
//         System.out.println(2*3.14*radius);
//     }
// }

class employee {
    String name;
    int id;
    int salary;

    public employee(String n, int i, int s) {
        name = n;
        id = i;
        salary = s;
    }

    void display() {
        System.out.println(name + " " + id + " " + salary);
    }
}

public class practice {
    public static void main(String[] args) {
        // student s1= new student("amit",1,84);
        // student s2= new student("rahul",2,92);
        // student s3= new student("om",3,71);

        // s1.details();
        // s2.details();
        // s3.details();

        // rectangle r1 = new rectangle();
        // r1.area(32, 42);
        // r1.parameter(32, 42);

        // laptop l1=new laptop("dell",16,60000);
        // laptop l2=new laptop("hp",8,45000);

        // l1.display();
        // l2.display();

        // claculator c1=new claculator(10,5);
        // c1.sum();
        // c1.sub();
        // c1.mul();
        // c1.div();

        // movie m1=new movie("inception",9,2010);
        // movie m2=new movie("the dark knight",10,2008);

        // m1.display();
        // m2.display();

        // bankaccount b1=new bankaccount("anushka",12345,5000);
        // b1.deposit(2000);
        // b1.withdraw(1000);

        // car c1=new car();
        // c1.details("audi","q7",6000000);
        // c1.details("bmw","x5",7000000);
        // c1.details("mercedes","gle",8000000);

        // circle c1=new circle();
        // circle c2=new circle();
        // c1.area(5);
        // c1.circumference(5);
        // c2.area(7);
        // c2.circumference(7);

        
        employee e1 = new employee("john", 101, 50000);
        employee e2 = new employee("alice", 102, 60000);
        e1.display();
        e2.display();

    }
}
