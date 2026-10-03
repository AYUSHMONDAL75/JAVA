class calculator{
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int diff(int a, int b){
        return a - b;
    }
    public static float diff(float a, float b){
        return a - b;
    }

    public static int multi(int a, int b){
        return a * b;
    }
    public static double multi(double a, double b){
        return a * b;
    }
}
public class static_method_overloading {
    public static void main(String[] args) {
        System.out.println("Summetion of two numbers are: "+calculator.sum(5, 6));
        System.out.println("Summetion of three numbers are: "+calculator.sum(5, 6, 7));

        System.out.println("Diffrence of two numbers are: "+calculator.diff(5, 6));
        System.out.println("diffrence of two numbers are: "+calculator.diff(6.0f, 3.87f));

        System.out.println("Product of two numbers are: "+calculator.multi(5, 6));
        System.out.println("Product of two numbers are: "+calculator.multi(5.987, 6.890));
    }
}