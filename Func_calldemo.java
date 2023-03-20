// chevk the flow of the function, using Function

public class Func_calldemo {
    
    public static void g() {
        System.out.println("Inside G...Before h()");
        h();
        System.out.println("Inside G...After h()");
    }
    
    public static void h() {
        System.out.println("Inside H...Before k()");
        k();
        System.out.println("Inside H...After k()");
    }
    
    public static void k() {
        System.out.println("Inside K...");
    }
    
    public static void main (String [] args) {
        System.out.println("Before G...");
        g();
        System.out.println("After G...");
    }
}