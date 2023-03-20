public class Recursion_Factorial {
    public static void main(String args[]) {
      
       System.out.println("The Factorial is " + factorial(4));
    }
    
    static int factorial(int n) {
        
        int fact;
        if(n == 1) {
            return 1;
        }
        return fact = n * factorial(n-1);
    }
}