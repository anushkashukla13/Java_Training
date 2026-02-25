// class atm{
//     private int paisa;
//     public atm(int r){
//         this.paisa=r;
//     }
//     public int getter(int a){
//         return paisa;
//     }
// }

class Student{
    private String name;

    private int marks;
    public Student(String n,int m){
        this.name=n;
        this.marks=m;

    }
    public  String gatter(String a) {
         return name;
    }
    public int gatter(int b){
        return marks;
    }
}


public class encapsulation {
    public static void main(String[] args) {
        // atm a1=new atm(100 );
        // System.out.println(a1.getter(20));
        Student s1 = new Student("bhoomikaa", 97);
        System.out.println(s1.gatter("bhoomika"));
        System.out.println(s1.gatter(97));
    }
}
