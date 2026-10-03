class arithmetic{
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }

    public float add(float a, float b){
        return a + b;
    }
}

public class method_overloading {
    public static void main(String[] args) {

        arithmetic cal = new arithmetic();
        
        System.out.println("Addition of two integers: "+cal.add(5,6));
        System.out.println("Addition of three integers: "+cal.add(5,6,7));
        System.out.println("Addition of two double: "+cal.add(5.0,6.9));
        System.out.println("Addition of two float: "+cal.add(5.0,6.0));
    }
}