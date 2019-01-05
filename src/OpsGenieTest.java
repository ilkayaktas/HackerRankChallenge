import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilkayaktas on 2018-12-23 at 13:49.
 */

public class OpsGenieTest {
    static String findNumber(List<Integer> arr, int k) {
        long count = arr.stream().filter(i -> i == k).count();

        if(count > 0 ){
            return "YES";
        }

        return "NO";

    }

    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if(i%2 != 0){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int mask  = 0x000F;
        int value = 0x2222;
        System.out.println(value&mask);

        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println(b instanceof B);
        System.out.println(b instanceof B && (! ( b instanceof A)));
        System.out.println(b instanceof B && (! ( b instanceof C)));

        int i=6, j=4, k=9;
        TestFirstApp.doIt(i,j,k);
        System.out.println(k);

        A ak = new A();
        A al = new B();

        System.out.println(ak.ABS);
        System.out.println(al.ABS);
    }
}

class A{
    String ABS;

    public A() {
        ABS = "A Class";
    }
}

class B extends A{
    String ABS;

    public B() {
        ABS = "B Class";
    }
}

class C extends B{

}

class TestFirstApp{
    static void doIt(int x , int y, int m){
        if(x == 5)m=y;
        else m=x;
    }
}

class OuterClass {

    static class StaticNestedClass {
        int i = 0;
    }
    class InnerClass {
        StaticNestedClass s = new StaticNestedClass();
    }
}