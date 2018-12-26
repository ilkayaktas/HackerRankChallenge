package package1;

/**
 * Created by aselsan on 26.12.2018 at 10:22.
 */

public class Book {
    protected String name;
    protected void getAll(){
        System.out.println("Protected access!");
    }

    String surname;
    void getPackagePrivate(){
        System.out.println("Package private");

    }

    public static void main(String[] args) {
        B b = new B();
        B.str = "As";
        System.out.println(A.str);
        B.write();
        A.write();
    }

}

class A{
    static String str = "A static";

    static void write(){
        System.out.println("A");
    }
}

class B extends A{
    static String str = "DDD";

    static void write(){
        System.out.println("B");
    }
}
