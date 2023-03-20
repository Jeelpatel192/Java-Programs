import java.lang.Math;

public class Area_Overloading {
    public static void main(String args[]) {
        float radius = 7;
        float length = 9, width = 8;
        float a = 3, b = 5, c = 6;

        System.out.println("The Area of Circle : " + area(radius));
        System.out.println("The Area of Rectangle : " + area(length, width));
        System.out.println("The Area of Triangle : " + area(a, b, c));
      
    }
    
    static float area(float r) {
        return 22/7 * r * r;
    }
    
    static float area(float l, float w) {
        return l * w;
    }
    
    static float area(float a, float b, float c) {
        float s = (float)(a+b+c) / 2.0f;
        return (float)(Math.sqrt(s * (s-a) * (s-b) * (s-c)));
    }
    
}